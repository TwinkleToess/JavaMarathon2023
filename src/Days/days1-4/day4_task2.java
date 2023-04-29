import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day4_task2 {
    public static void main(String[] args) {
        int[] massive = new int[1000];
        Random rand = new Random();

        for(int i = 0; i< massive.length; i++){
            massive[i]= rand.nextInt(10001);
        }
        int max = massive[0];
        int min = massive[0];
        int ten = 0;
        int summ = 0;
        for(int x:massive){
         if(x>max){
              max=x;
          } else if (x<min) {
              min = x;
          }
          if (x%10==0){
              ten += 1;
              summ += x;
          }

        }
        System.out.println(Arrays.toString(massive));
        System.out.println(max);
        System.out.println(min);
        System.out.println(ten);
        System.out.println(summ);
    }
}
