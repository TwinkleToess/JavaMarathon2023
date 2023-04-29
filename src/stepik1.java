import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class stepik1 {
  /*  На вход поступает целое число N > 1. На следующей строке расположена последовательность из N положительных уникальных чисел.
    Требуется найти второе минимальное число в последовательности. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число...");
        int n = in.nextInt();
        while(n<=1){
            System.out.println("Введите число >1");
            n = in.nextInt();
        }
        Random rand = new Random();
        int[] array = new int[n];
        for(int i = 0; i< array.length-1; i++){
            while(array[i]==array[i+1] && i< array.length-1) {
                array[i] = rand.nextInt(0, 11);
            }
        }
        // Arrays.sort(array);
        int k = 0;
        while(true){
           if(array[k]<array[k+1] && (k < array.length)) {
               k++;
           } else break;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[k]);

    }

}

