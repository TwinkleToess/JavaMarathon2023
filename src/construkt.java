import java.util.Scanner;

public class construkt {
    public static void main(String[] args) {
        Human kirill = new Human("Kirill",14);
        Human dima = new Human("Dima", 12);
        Human tema = new Human("Artem", 11);
        kirill.countOfPeople();

    }
}

class Human{
    String name;
    int age;
    public static String description;    //static создает переменную для класса
    public static int countPeople;

    public static final int CONSTANTA = 15;

    public static void returnDescription(){
        System.out.println(description);
    }
    public Human(){
        System.out.println("Привет из первого конструктора");
        this.name = "Имя по-умолчанию";
        this.age = 0;
        countPeople++;
    }
    public Human(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
        countPeople++;
    }
    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+" "+age);
    }
    public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description + " ");
    }
    public static void printAllFields(){
        System.out.println(description);
    }
    public static void countOfPeople(){
        System.out.println(countPeople);
    }
}
