import java.util.Scanner;

public class construkt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Human2 human1 = new Human2(name, age);
        human1.getInfo();


    }
}

class Human2{
    String name;
    int age;
    public Human2(){
        System.out.println("Привет из первого конструктора");
        this.name = "Имя по-умолчанию";
        this.age = 0;
    }

    public Human2(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }
    public Human2(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name=name;
        this.age=age;
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
}
