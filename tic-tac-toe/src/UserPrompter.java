/**
 * Created by adhulip on 3/6/14.
 */
public class UserPrompter {
    private Printer printer;

    public UserPrompter(Printer printer) {
        this.printer = printer;
    }

    public void askMove() {
        printer.render("Choose Move:");
    }
}
