import org.hamcrest.Matcher;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by adhulip on 3/6/14.
 */
public class UserPrompterTest {
    @Test
    public void printAskingUserTextWhenAskUser() throws IOException {
        BufferedReader reader = mock(BufferedReader.class);
        Printer printer = mock(Printer.class);
        UserPrompter userPrompter = new UserPrompter(printer, reader);
        when(reader.readLine()).thenReturn("1");

        userPrompter.askMove();

        verify(printer).render("Choose Move:");
    }

    @Test
    public void getInputFromUserWhenAskUser() throws IOException {
      BufferedReader reader = mock(BufferedReader.class);
      Printer printer = mock(Printer.class);
      UserPrompter userPrompter = new UserPrompter(printer, reader);
      when(reader.readLine()).thenReturn("1");

      userPrompter.askMove();

        try {
            verify(reader).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void returnsInputFromUserAsInt() throws IOException {
        BufferedReader reader = mock(BufferedReader.class);
        Printer printer = mock(Printer.class);
        UserPrompter userPrompter = new UserPrompter(printer, reader);

        when(reader.readLine()).thenReturn("1");

        assertThat(userPrompter.askMove(), is(1));
    }


}
