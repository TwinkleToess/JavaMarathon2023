import java.util.Arrays;
import java.util.Random;

public class day4_task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int[] summ = new int[12];
        Random rand = new Random();
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j]= rand.nextInt(51);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        } /* Сгенерировали матрицу matrix */

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                summ[i]+=matrix[i][j];
            }
        } /* Суммировали все строки */

        int max = summ[0]; // Переменная для хранения максимального значения
        int counter = 0; // Счетчик общего кол-ва элементов
        int fin_counter = 0; // Счетчик в который будет передан индекс максимального элемента
        for(int i = 0; i<summ.length;i++){
            if(max<summ[i]){
                fin_counter = counter;
                max=summ[i];
            }
            counter +=1;
        }
        System.out.println("=========");
        System.out.println(Arrays.toString(summ));
        System.out.println(fin_counter);
    }

}
