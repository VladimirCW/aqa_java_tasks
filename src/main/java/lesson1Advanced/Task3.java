package lesson1Advanced;

/* Мое имя
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "*";
        int l = 9;
        for (int i = l; i <= l; i++) {
            for (int j = i; j < l-1; j++) {
                System.out.print(" " + s);
            }
            System.out.println(s + " ");
        }
    }
}