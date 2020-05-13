import lesson1.Task2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Task2Test {

    private static Task2 task2;

    //how many rows in the block? We are expecting for 5
    @Parameters({ "expectedRows" })
    @Test
    public static void checkForStrings (int expectedRows) {
        int actualRows = task2.blockNames().split("\\n").length;
        assertEquals(actualRows, expectedRows, "Error in Task2, checkForStrings : Expected '" + expectedRows + "' rows in block, but found '" +actualRows+ "'");
        System.out.println("checkForStrings passed");
    }

    //how many words in the block? We are expecting for 50
    @Parameters({ "expectedWordsAmount" })
    @Test
    public static void checkForWordsAmountInBlock (int expectedWordsAmount) {
        int actualWordsAmount =  task2.blockNames().replace("\n", "").trim().split(" ").length;
        assertEquals(actualWordsAmount, expectedWordsAmount, "Error in Task2, checkForStrings : Expected '" + expectedWordsAmount + "' words in block, but found '" +actualWordsAmount+ "'");
        System.out.println("checkForWords passed");
    }

    //Is only letters in names?
    @Test
    public static void checkForWordsIsLettersOnly () {
        String[] words =  task2.blockNames().replace("\n", " ").trim().split(" ");

        // костыль чтобы зафейлить этоттест
        //String[] words =  task2.blockNames().replace("\n", "1").trim().split(" ");
        boolean flg = true;
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if(!Character.isLetter(c)) {
                    System.out.println(">>" + c + "<<");
                    flg = false;
                    break;
                }
            }
        }
        assertTrue(flg, "Error in Task2, checkForWordsIsLettersOnly : The non-Letter symbol has been found'");
        System.out.println("checkForWordsIsLettersOnly passed");
    }
}
