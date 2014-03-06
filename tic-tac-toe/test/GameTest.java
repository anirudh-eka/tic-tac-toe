import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class GameTest {
    @Test
    public void shouldMakeBoard(){
        Board board = mock(Board.class);
        Game game = new Game(board);

        game.run();

        verify(board).show();
    }
}
