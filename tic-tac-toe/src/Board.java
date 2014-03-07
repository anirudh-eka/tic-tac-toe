import java.util.ArrayList;
import java.util.List;

/**
 * Created by adhulip on 3/6/14.
 */
public class Board {
    private BoardBuilder boardBuilder;
    private Printer printer;
    private List playerMoves = new ArrayList<Integer>();

    public Board(BoardBuilder boardBuilder, Printer printer) {
        this.boardBuilder = boardBuilder;
        this.printer = printer;
    }

    public void show() {
        printer.render(boardBuilder.build(playerMoves));
    }

    public void placeMove(int i) {
        playerMoves.add(i);
    }
}
