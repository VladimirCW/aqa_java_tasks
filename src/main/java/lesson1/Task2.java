package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        System.out.println(blockNames());
    }

    public static String blockNames(){
        String s = "Alex ";
        String name = "";

        for (int j = 0; j < 5; j++ ) {
            for (int i = 0; i < 10; i++) {
                name += i == 9 ? s + "\n" : s;
                //System.out.print(i == 9 ? s + "\r\n" : s); //last word in the string will be printed with the "return"
            }
        }
        return name;
    }
}