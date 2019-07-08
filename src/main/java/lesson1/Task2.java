package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        String s = "Vladimir";

        {
            for (int i = 0; i < 1; i++)

        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
    }
    }
}

//    public static void main(String[] args) {
//        String s = "Vladimir";
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Vladimir");
//        }
//    }
