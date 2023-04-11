import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива...");
        int l = scanner.nextInt();
        int[] massive = new int[l];
        int m8 = 0;
        int m1 = 0;
        int del2 = 0;
        int nodel2 = 0;
        int summ = 0;
        for(int x = 0; x<massive.length; x++){
            massive[x] = rand.nextInt(11);
            if(massive[x] > 8){
                m8 +=1;
            }
            if (massive[x]==1) {
                m1 +=1;
            }
            if((massive[x]%2)==0){
                del2 +=1;
            } else {nodel2+=1;}
            summ += massive[x];
            System.out.println(massive[x]);
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Длина массива: "+massive.length);
        System.out.println("Количество чисел больше 8: "+m8);
        System.out.println("Количество чисел равных 1: "+m1);
        System.out.println("Количество четных чисел: "+del2);
        System.out.println("Количество нечетных чисел: "+nodel2);
        System.out.println("Сумма всех элементов массива: "+summ);


    }
}
