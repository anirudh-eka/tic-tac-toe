import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class GameTest {
    @Test
    public void shouldShowBoard(){
        UserPrompter userPrompter = mock(UserPrompter.class);
        Board board = mock(Board.class);
        Game game = new Game(board, userPrompter);

        game.run();
        verify(board).show();
    }

    @Test
    public void shouldAskForUserInput(){
        UserPrompter userPrompter = mock(UserPrompter.class);
        Board board = mock(Board.class);
        Game game = new Game(board, userPrompter);

        game.run();

        verify(userPrompter).askMove();
    }
}
