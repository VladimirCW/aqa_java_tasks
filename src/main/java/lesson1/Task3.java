package lesson1;

public class Task3 {

    public static void main(String[] args) {
        int i = 1,  j = 1;
        String s = "Vladimir";
        while (i <= 5) {
            while (j <= 10) {
                System.out.print(s + " ");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
}



