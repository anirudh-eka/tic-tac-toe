import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by adhulip on 3/6/14.
 */
public class Board {
    private Printer printer;
    private List playerMoves = new ArrayList<Integer>();

    public Board(Printer printer) {
        this.printer = printer;
    }

    public void show() {
        printer.render(playerMoves);
    }

    public void placeMove(int i) {
        playerMoves.add(i);
    }
}
