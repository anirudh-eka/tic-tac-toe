import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by adhulip on 3/6/14.
 */
public class UserPrompter {
    private Printer printer;
    private BufferedReader reader;

    public UserPrompter(Printer printer, BufferedReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public Integer askMove() {
        printer.render("Choose Move:");
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

    }
}
