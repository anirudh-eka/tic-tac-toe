import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adhulip on 3/6/14.
 */
public class BoardBuilderTest {

    @Test
    public void shouldBuildBoardString() {
        BoardBuilder builder = new BoardBuilder();
        List list = new ArrayList();
        assertThat(builder.build(list), is("  |  |  \n---------\n  |  |  \n---------\n  |  |  "));

        list.add(1);
        assertThat(builder.build(list), is(" X|  |  \n---------\n  |  |  \n---------\n  |  |  "));

        list.add(5);
        assertThat(builder.build(list), is(" X|  |  \n---------\n  | X|  \n---------\n  |  |  "));
    }

    @Test
    public void shouldUpdateRowStringGivenInitialRowString() {
        BoardBuilder builder = new BoardBuilder();
        assertThat(builder.buildRow(2, "  |  |  "), is("  | X|  "));
        assertThat(builder.buildRow(1, "  |  |  "), is(" X|  |  "));
        assertThat(builder.buildRow(3, "  |  |  "), is("  |  | X"));
    }
}
