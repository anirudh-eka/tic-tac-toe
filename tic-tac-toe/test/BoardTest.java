import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyList;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by adhulip on 3/6/14.
 */
public class BoardTest {
    private Board board;
    private List<Integer> list;
    private BoardBuilder boardBuilder;
    private Printer printer;

    @Before
    public void setUp() {
        boardBuilder = mock(BoardBuilder.class);
        printer = mock(Printer.class);
        board = new Board(boardBuilder, printer);
        list = new ArrayList<Integer>();
    }

    @Test
    public void renderBoardStringWhenShowIsCalled() {
        when(boardBuilder.build(any(List.class))).thenReturn("list in string form");
        board.show();
        verify(boardBuilder).build(list);
        verify(printer).render("list in string form");
    }

    @Test
    public void addsXToBoardWhenPlaceMove() {
        list.add(1);
        board.placeMove(1);
        board.show();
        verify(boardBuilder).build(list);
    }
}
