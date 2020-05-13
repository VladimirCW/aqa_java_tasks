package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        //System.out.println(reverse("Hello world!!!"));
    }

    //By StringBuilder reverse()
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return str;
    }
}
