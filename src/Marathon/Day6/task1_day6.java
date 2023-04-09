package Marathon.Day6;

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
    class Car {
        private String model;
        private String color;
        private int year;


        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void info() {
            System.out.println("Это автомобиль");
        }

        public int yearDifference(int inputYear) {
            return inputYear - year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }


    }

    class Motorbike {
        private String model;
        private String color;
        private int year;

        public Motorbike(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }

        public void info() {
            System.out.println("Это мотоцикл");
        }

        public int yearDifference(int inputYear) {
            return inputYear - year;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }
    }

    /*=================TASK 2=================*/

    class Airplane {
        String manufacturer;

        int year;
        int length;
        int weight;
        int fuel;

        Airplane(String manufacturer, int year, int length, int weight) {
            int fuel = 0;
            this.manufacturer = manufacturer;
            this.year = year;
            this.weight = weight;
            this.length = length;
        }

        public void info() {
            System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year + " , длина: " + length +
                    ", вес: " + weight + ", количество топлива в баке:" + fuel);
        }

        public void fullUp(int n) {
            this.fuel += n;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public  void setWeight(int weight) {
            this.weight = weight;
        }
    }
