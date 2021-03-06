import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by adhulip on 3/6/14.
 */
public class Game {
    private Board board;
    private UserPrompter userPrompter;

    public static void main(String[] args) {
        Printer printer = new Printer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BoardBuilder builder = new BoardBuilder();
        new Game(new Board(builder, printer), new UserPrompter(printer, reader)).run();
    }

    public Game(Board board, UserPrompter userPrompter) {
        this.board = board;
        this.userPrompter = userPrompter;
    }

    public void run() {
        board.show();
        board.placeMove(userPrompter.askMove());
    }
}
