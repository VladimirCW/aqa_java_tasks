package lesson1Advanced;

public class Task1 {
    /* Минимум n чисел
    Написать функцию, которая вычисляет минимум из массива чисел.
    */
    public static void main(String[] args) {

        int array[] = {2,4,6,1,90,2,0,-1};
        int min = array[0];
        for(int x: array) {
        if(x < min) min = x;
        }
                System.out.println("Minimal element: " + min);
    }


}



=======
        //System.out.println(min([2,4,6]));
        //System.out.println(min([2,4,6,1,90,2,0]));
    }

    public static int min(int[] a) {
        return 0;
    }
}
>>>>>>> origin/master
