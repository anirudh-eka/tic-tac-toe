import org.junit.Test;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class PrinterTest {
    @Test
    public void shouldPrintEmptyBoardToConsoleWhenRenderIsCalledWithEmptySet() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        Set set = new HashSet();

        printer.render(set);

        verify(printStream).println("  |  |  \n---------\n  |  |  \n---------\n  |  |  ");
    }

    @Test
    public void shouldPrintBoardWithXCorrespondingToIntsInSetWhenRenderIsCalledWithNonEmptySet() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        Set set = new HashSet();
        set.add(1);

        printer.render(set);

        verify(printStream).println(" X|  |  \n---------\n  |  |  \n---------\n  |  |  ");
    }

    @Test
    public void shouldReturnRowWithLocationsFilledInWhenConstructRowIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();

        assertThat(printer.constructRow(2, "  |  |  "), is("  | X|  "));
        assertThat(printer.constructRow(1, "  |  |  "), is(" X|  |  "));
        assertThat(printer.constructRow(3, "  |  |  "), is("  |  | X"));
    }

    @Test
    public void shouldPrintStringToConsoleWhenReaderIsCalledWithStringArg() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.render("hello world");
        verify(printStream).println("hello world");
    }
}
