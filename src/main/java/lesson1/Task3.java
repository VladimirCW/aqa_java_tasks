package lesson1;

public class Task3 {

    public static void main(String[] args) {

        int i = 1;
        int b = 1;
        String s = "Vladimir";
        while (i <= 5) {
            while (b <= 10) {
                System.out.print(s + " ");
                b++;
            }
            System.out.println();
            b = 1;
            i++;
        }
    }
}



