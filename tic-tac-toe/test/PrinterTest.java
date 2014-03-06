import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class PrinterTest {
    @Test
    public void printEmptyBoardToConsoleWhenRenderIsCalledWithNoArgs() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.render();
        verify(printStream).println("  |  |  \n  |  |  \n  |  |  ");
    }

    @Test
    public void printStringToConsoleWhenReaderIsCalledWithStringArg() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.render("hello world");
        verify(printStream).println("hello world");
    }
}
