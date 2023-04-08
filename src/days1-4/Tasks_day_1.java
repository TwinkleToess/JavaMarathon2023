import java.util.Scanner;

public class Tasks_day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[+] Введите два числа:");
        double x = scanner.nextDouble();
        double y;
        if(x>=5){
            y = ((x*x)-10.0)/(x+7.0);
            System.out.println(y);
        } else if (x>(-3.0)&&x<5.0) {
            y = (x+3.0)*((x*x)-2);
            System.out.println(y);
        } else {y = 420.0;
            System.out.println(y);};


    }

}
