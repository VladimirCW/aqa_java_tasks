import lesson1.Task5;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Task3Test {

    private static Task5 task;


    //is task.reverse(hw) returns "!!!dlrow olleH" ?
    @Parameters({ "hw", "rhw" })
    @Test
    public static void checkForRHW (String rhw, String hw) {
        String actualRewHW = task.reverse(hw);
        assertEquals(actualRewHW, rhw, "Error in Task5, checkForStrings : Expected '" + rhw + "' row, but found '" +actualRewHW+ "'");
        System.out.println("checkForRHW passed");
    }



    //is task.reverse(hw) returns "!!!dlrow olleH" ?
    @Parameters({ "hw", "rhw" })
    @Test
    public static void checkForStringLengthEquals (String hw, String rhw) {
        int expectedLength = rhw.length();
        int actualLength = task.reverse(hw).length();
        assertEquals(expectedLength, actualLength, "Error in Task5, checkForStringLengthEquals : Expected '" + expectedLength + "' symbols, but found '" +actualLength+ "' symbols. Could you check the '" + hw + "' string");
        System.out.println("checkForStringLengthEquals passed");
    }
}
