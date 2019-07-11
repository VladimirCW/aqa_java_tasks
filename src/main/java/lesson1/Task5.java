package lesson1;

public class Task5 {

    public static void main(String[] args) {
        String st  = "Hello world!!!";
        char symbols[] = st.toCharArray();
        for (int i=symbols.length-1; i>=0; i--) {
            System.out.print(symbols[i]);
        }
    }
}
