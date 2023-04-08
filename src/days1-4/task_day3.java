import java.util.Scanner;

public class task_day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введи первое число");
            double a = scanner.nextDouble();
            System.out.println("Введи второе число");
            double b = scanner.nextDouble();
            if(b==0){
                break;
            }
            double c = a/b;
            System.out.println(c);
        }


    }

}
