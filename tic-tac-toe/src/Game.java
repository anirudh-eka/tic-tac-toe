/**
 * Created by adhulip on 3/6/14.
 */
public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void run() {
        board.show();
    }
}
