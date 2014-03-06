import java.util.Set;

/**
 * Created by adhulip on 3/6/14.
 */
public class Printer {
    public void render(Set set) {
        if(set.isEmpty()) {
            System.out.println("  |  |  \n---------\n  |  |  \n---------\n  |  |  ");
        } else if (set.contains(1)) {
            System.out.println(" X|  |  \n---------\n  |  |  \n---------\n  |  |  ");
        }
    }

    public void render(String s) {
        System.out.println(s);
    }

    public String constructRow(int i, String rowString) {

        if (i == 1) {
            return rowString.substring(0, 1)+"X"+rowString.substring(2, 8);
        } else if (i == 2) {
            return rowString.substring(0, 4)+"X"+rowString.substring(5, 8);
        } else if (i == 3) {
            return rowString.substring(0, 7)+"X"+rowString.substring(8);
        } else {
            return rowString;
        }
    }
}
