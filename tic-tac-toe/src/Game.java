/**
 * Created by adhulip on 3/6/14.
 */
public class Game {
    private Board board;

    public static void main(String[] args) {
        new Game(new Board(new Printer())).run();
    }

    public Game(Board board) {
        this.board = board;
    }

    public void run() {
        board.show();
    }
}
