/**
 * Created by adhulip on 3/6/14.
 */
public class Board {
    private Printer printer;
    public Board(Printer printer) {
        this.printer = printer;
    }

    public void show() {
        printer.render();
    }
}
