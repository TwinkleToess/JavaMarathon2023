package Marathon.Day6.Vehicle;

import java.util.Scanner;

public class task1_day6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи текущий год ---->");
        int input = scanner.nextInt();

        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setModel("UAZ");
        car1.setYear(1975);
        car1.info();
        System.out.println("[+] Возраст автомобиля: " + car1.yearDifference(input));


        Motorbike moto1 = new Motorbike("Jawa", "Blue", 1965);
        moto1.info();
        System.out.println("[+] Возраст мотоцикла: " + moto1.yearDifference(input));

        Airplane air = new Airplane("Russian Airlines", 2012, 60, 4200);
        air.setManufacturer("European airlines");
        air.setLength(90);
        air.setWeight(2200);
        air.setYear(2013);
        while (true) {
            System.out.println("Введи уровень топлива для дозаправки---->");
            int fuel = scanner.nextInt();
            if (fuel > 1) {
                air.fullUp(fuel);
                air.info();
            } else {
                break;
            }


        }

    }
}
