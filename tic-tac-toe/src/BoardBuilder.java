import java.util.List;

/**
 * Created by adhulip on 3/6/14.
 */
public class BoardBuilder {
    private String firstRow = "  |  |  ";
    private String secondRow = "  |  |  ";
    private String thirdRow = "  |  |  ";

    public String build(List<Integer> list) {

        for(Integer i : list) {
            if (i > 0 && i <= 3) {
                firstRow = buildRow(i, firstRow);
            } else if (i > 3 && i <= 6) {
                secondRow = buildRow(i-3, secondRow);
            } else if (i > 6 && i <= 9) {
                thirdRow = buildRow(i-6, thirdRow);
            }
        }

        return firstRow + "\n---------\n"+ secondRow +"\n---------\n"+ thirdRow;
    }

    public String buildRow(int i, String rowString) {
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
