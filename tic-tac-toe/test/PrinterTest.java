import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        List list = new ArrayList();

        printer.render(list);

        verify(printStream).println("  |  |  \n---------\n  |  |  \n---------\n  |  |  ");
    }

    @Test
    public void shouldPrintBoardWithXCorrespondingToIntsInSetWhenRenderIsCalledWithNonEmptySet() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        List list = new ArrayList();
        list.add(1);

        printer.render(list);

        verify(printStream).println(" X|  |  \n---------\n  |  |  \n---------\n  |  |  ");

        list.add(5);
        printer.render(list);

        verify(printStream).println(" X|  |  \n---------\n  | X|  \n---------\n  |  |  ");
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
    public void shouldUpdateFirstRowWithLocationsWhenUpdateFirstRowIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.updateFirstRow(2);
        assertThat(printer.getFirstRow(), is("  | X|  "));
        printer.updateFirstRow(1);
        assertThat(printer.getFirstRow(), is(" X| X|  "));
    }

    @Test
    public void shouldUpdateSecondRowWithLocationsWhenUpdateSecondRowIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.updateSecondRow(2);
        assertThat(printer.getSecondRow(), is("  | X|  "));
        printer.updateSecondRow(3);
        assertThat(printer.getSecondRow(), is("  | X| X"));
    }

    @Test
    public void shouldUpdateThirdRowWithLocationsWhenUpdateThirdRowIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.updateThirdRow(2);
        assertThat(printer.getThirdRow(), is("  | X|  "));
//        printer.updateThirdRow(3);
//        assertThat(printer.getThirdRow(), is("  | X| X"));
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
