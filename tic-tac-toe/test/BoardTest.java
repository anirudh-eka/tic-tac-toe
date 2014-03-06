import org.junit.Test;

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

        board.show();

        verify(printer).render();
    }
}
