public class MultiImensional_Arrays {
    public static void main(String[] args) {
     int[] numbers = {1, 2, 3}; /*Одномерный массив. Одномерный потому что мы можем обратиться к каждому элементу,
                                  используя его индекс*/
        System.out.println(numbers[0]); /*Одномерный массив - всегда какая-то линия. */
        /*Двумерный массив - матрица или таблица чисел
        * 1,2,3,5 - однномерный массив
        * 156
        * 375 [1][1] - получаем элемент "7"
        * 240
        * В двумерном массиве необходимо два индекса, чтобы получить его элемент
        * */

        int[][] matrice =   {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for(int i = 0; i<matrice.length; i++){
            for(int j = 0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println("");
        }

/*        int[] n = new int[3];
        String[][] strings = new String[3][3];
        strings[1][2]="QQ";
        System.out.println(strings[1][2]);
*/


    }
}
