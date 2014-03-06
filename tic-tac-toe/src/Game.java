/**
 * Created by adhulip on 3/6/14.
 */
public class Game {
    private Board board;
    private UserPrompter userPrompter;

    public static void main(String[] args) {
        Printer printer = new Printer();
        new Game(new Board(printer), new UserPrompter(printer)).run();
    }

    public Game(Board board, UserPrompter userPrompter) {
        this.board = board;
        this.userPrompter = userPrompter;
    }

    public void run() {
        board.show();
        userPrompter.askMove();
    }
}
