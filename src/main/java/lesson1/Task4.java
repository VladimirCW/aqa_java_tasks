package lesson1;

final class Task4 {

    public static void main(String[] args) {
        String s = "Vladimir";
        int i = 0, j = 0;
        do {
            System.out.println();
            i++;
            do {
                System.out.print(s + " ");
                j++;

            } while (j <= 10);
            j = 0;
        } while (i <= 4);
    }
}







