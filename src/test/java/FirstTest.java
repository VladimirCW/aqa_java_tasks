import lesson1.Task1;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FirstTest {
    @Test
    public static void definerSmallerNumber () {
        Task1 task1 = new Task1();
        int min = task1.min(2,5,8);
        int expectedMin = 1;
        int actualMin = task1.min(2,5,8);
        //assertEquals(actualMin, expectedMin, "Error in Task1 : Expected '" + expectedMin + "', but found '" +actualMin+ "'");
        assertEquals(actualMin, expectedMin, "Error in Task1 : ");
    }
}
