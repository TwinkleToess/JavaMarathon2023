package Marathon.Day5;

import java.io.NotActiveException;

public class Task1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Bentley");
        car1.setColor("Purple");
        car1.setYear(2023);

        Motorbike moto1 = new Motorbike("Yamaha", "White", 1990);

        System.out.println("My car is - " + car1.getColor() + " " + car1.getModel()+". Year is - "+car1.getYear());
        System.out.println("My bike is - " + moto1.getColor() + " " + moto1.getModel()+". Year is - "+moto1.getYear());
    }

}

class Car{
    private String model;
    private String color;
    private int year;

    void setModel(String model){
        this.model=model;
    }
    void setColor(String color){
        this.color=color;
    }
    void setYear(int year){
        this.year=year;
    }

    String getColor(){
        return color;
    }
    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }
}

//==================TASK 2==================//



class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    int getYear(){
        return year;
    }
}