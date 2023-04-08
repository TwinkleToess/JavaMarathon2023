import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int value;
        do{
            System.out.println("Введи 5");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
        }while(value!=5);


    }

}
