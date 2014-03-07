import java.util.List;

/**
 * Created by adhulip on 3/6/14.
 */
public class Printer {
    private String firstRow = "  |  |  ";
    private String secondRow = "  |  |  ";
    private String thirdRow = "  |  |  ";

    public void render(List<Integer> list) {

        for(Integer i : list) {
            if (i > 0 && i <= 3) {
                updateFirstRow(i);
            } else if (i > 3 && i <= 6) {
                updateSecondRow(i-3);
            } else if (i > 6 && i <= 9) {
                updateThirdRow(i-6);
            }
        }

        System.out.println(firstRow + "\n---------\n"+ secondRow +"\n---------\n"+ thirdRow);
    }

    public void render(String s) {
        System.out.println(s);
    }

    public void updateFirstRow(int i) {
        firstRow = constructRow(i, firstRow);
    }

    public String getFirstRow() {
        return firstRow;
    }

    public void updateSecondRow(int i) {
        secondRow = constructRow(i, secondRow);
    }

    public String getSecondRow() {
        return secondRow;
    }

    public void updateThirdRow(int i) {
        thirdRow = constructRow(i, thirdRow);
    }

    public String getThirdRow() {
        return thirdRow;
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
