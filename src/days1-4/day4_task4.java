import java.util.Arrays;
import java.util.Random;

public class day4_task4 {
    public static void main(String[] args) {
        int[] massive = new int[20];
        Random rand = new Random();
        for(int i = 0; i<massive.length; i++){
            massive[i] = rand.nextInt(10);
        }
        int maximum = 0;
        int fin_maximum = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;

        for(int i = 0; i<massive.length-3; i++){
            maximum = massive[i] + massive[i+1] + massive[i+2];
            if(fin_maximum<maximum){
                fin_maximum=maximum;
                v1 = massive[i];
                v2 = massive[i+1];
                v3 = massive[i+2];
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println(fin_maximum);
        System.out.println(v1+" "+v2+" "+v3);
    }
}
