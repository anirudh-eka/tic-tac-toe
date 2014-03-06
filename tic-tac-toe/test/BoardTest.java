import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class BoardTest {
    @Test
    public void renderBoardWhenShowIsCalled() {

        Printer printer = mock(Printer.class);
        Board board = new Board(printer);
        Set set = new HashSet<Integer>();

        board.show();

        verify(printer).render(set);
    }

    @Test
    public void addsXToBoardWhenPlaceMove() {
        Printer printer = mock(Printer.class);
        Board board = new Board(printer);
        Set set = new HashSet<Integer>();
        set.add(1);

        board.placeMove(1);

        board.show();

        verify(printer).render(set);
    }
}
