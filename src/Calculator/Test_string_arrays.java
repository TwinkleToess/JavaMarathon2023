package Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Test_string_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputString = scan.nextLine().split(" ");
        System.out.println(Arrays.toString(inputString));

    }
}
