package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        /*  StringBuffer str = new StringBuffer("Hello world!!!");
        str.reverse();
        System.out.println(str);
    }

}*/
     String str  = "Hello world!!!";
     char reverseArray [] = str.toCharArray();
     for (int i=reverseArray.length-1; i>=0; i--) {
         System.out.print(reverseArray[i]);
     }
 }
}
