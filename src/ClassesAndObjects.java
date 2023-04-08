import java.util.Scanner;

public class ClassesAndObjects {
    //    У класса может быть:
    //    1. Данные (поля)
    //    2. Действия, которые он может совершать (методы)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("Введите имя и возраст первого человека... ");
        person1.setName(scanner.next(), scanner.nextInt());
        System.out.println("Введите имя и возраст второго человека... ");
        person2.setName(scanner.next(), scanner.nextInt());
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        person1.speak();
        System.out.println(year1+" "+year2);
        person2.speak();
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String username, int userage){
        name = username;
        age = userage;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        for(int i = 0; i<1; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет");
    }
}
