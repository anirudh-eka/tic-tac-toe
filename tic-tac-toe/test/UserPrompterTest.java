import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class UserPrompterTest {
    @Test
    public void getUserInput() {
        Printer printer = mock(Printer.class);
        UserPrompter userPrompter = new UserPrompter(printer);

        userPrompter.askMove();

        verify(printer).render("Choose Move:");
    }


}
