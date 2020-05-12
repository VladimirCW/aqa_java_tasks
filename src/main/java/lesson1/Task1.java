package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        //System.out.println(min(5,2,3));
        //System.out.println(min(5,2,3));
        try {
            System.out.println(min(5,2,3));    // try to define lesser
        } catch (Exception e){
            System.out.println("Something horrible happened : " + e.getLocalizedMessage());// мало ли...
        }
    }

    public static int min(int a, int b, int c) {

        int min = 0;

        if (a < b && a < c){        //all different
            min = a;
        } else if (b < a & b < c) { //all different
            min = b;
        } else if ( c < a & c < b) { //all different
            min = c;
        } else if (a == b & a < c) { // some equals
            min = a;
        } else if (a == c & a < b) { // some equals
            min = a;
        } else if (b == c & a > b) {// some equals
            min = b;
        } else if (a == b & a == c){ // equals
            min = a;
        }
        return min;
    }
}
