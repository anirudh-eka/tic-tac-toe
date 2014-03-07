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
    public void shouldPrintStringToConsole() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);
        Printer printer = new Printer();
        printer.render("hello world");
        verify(printStream).println("hello world");
    }
}
