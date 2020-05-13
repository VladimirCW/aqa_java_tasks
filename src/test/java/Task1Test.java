import lesson1.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1Test {

    // with DP
    @Test(dataProvider = "getIntegerData")
    public static void definerSmallerNumberDP (String sI, int expectedMin) {
        // debug message
        System.out.println("Instance DataProvider : Data(provided set of numbers :  "+ sI + ", expected smaller number : " + expectedMin + ")");

        // get three integer for task1.min method parameters
        String[] intChunks = sI.split(",");

        // new Object here
        Task1 task1 = new Task1();

        // define actual min
        int actualMin = task1.min(Integer.parseInt(intChunks[0]), Integer.parseInt(intChunks[1]), Integer.parseInt(intChunks[2]));

        // assert. Please comment line below if you need a failed test
        assertEquals(actualMin,expectedMin, "Error in Task1 : Expected '" + expectedMin + "', but found '" +actualMin+ "'");


        //>>>>>>>>>>>>>>>>>>>>>>>>>Костль для фэйл теста**************************
        //int expTempMin = 1;
        //assertEquals(actualMin, expTempMin, "Error in Task1 : Expected minimal number '" + expTempMin + "', but found '" +actualMin+ "'");
        //<<<<<<<<<<<<<<<<<<<<<<<<<Костль для фэйл теста**************************
        System.out.println("Test passed");
    }


    // with testng.xml
    @Parameters({ "set_of_numbers", "expectedMin" })
    @Test
    public static void definerSmallerNumberXML(String set_of_numbers, int expectedMin) {
        // debug message
        System.out.println("Parameters : Parameters(provided set of numbers :  " + set_of_numbers + ", expected smaller number : " + expectedMin + ")");

        // get three integer for task1.min method parameters
        String[] intChunks = set_of_numbers.split(",");

        // new Object here
        Task1 task1 = new Task1();

        // define actual min
        int actualMin = task1.min(Integer.parseInt(intChunks[0]), Integer.parseInt(intChunks[1]), Integer.parseInt(intChunks[2]));

        // assert. Please comment line below if you need a failed test
        assertEquals(actualMin, expectedMin, "Error in Task1 : Expected '" + expectedMin + "', but found '" + actualMin + "'");


        //>>>>>>>>>>>>>>>>>>>>>>>>>Костль для фэйл теста**************************
        //int expTempMin = 1;
        //assertEquals(actualMin, expTempMin, "Error in Task1 : Expected minimal number '" + expTempMin + "', but found '" +actualMin+ "'");
        //<<<<<<<<<<<<<<<<<<<<<<<<<Костль для фэйл теста**************************
        System.out.println("Test passed");
    }

    @DataProvider
    public Object[][] getIntegerData() {
        return new Object[][]{
                {"1,2,3", 1},
                {"3,2,1", 1},
                {"-1,0,1", -1},
                {"1,1,2", 1},
                {"2,2,1", 1},
                {"1,1,1", 1}
        };
    }

}
