package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Nick";
        int i = 0;
        do {
            System.out.print(s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " ");
            System.out.println(s);
            i++;
        } while (i < 5);
    }
}