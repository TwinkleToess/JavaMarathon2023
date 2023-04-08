import java.util.Scanner;

public class ClassesAndObjects {
    //    У класса может быть:
    //    1. Данные (поля)
    //    2. Действия, которые он может совершать (методы)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Somename", 15);
        System.out.println("Введите имя и возраст первого человека... ");
        person1.setName(scanner.next(), scanner.nextInt());

        System.out.println("Введите имя и возраст второго человека... ");
        person2.setName(scanner.next(), scanner.nextInt());

        System.out.println(person1.getAge() +" "+person2.getName());

    }

    static class Person {
        private String name;
        private int age;

        public void setName(String username, int userage) {
            if (username.isEmpty()) {
                System.out.println("Введите все требуемые значения!");
            } else {
                name = username;
                age = userage;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        void sayHello() {
            System.out.println("Привет");
        }

    }

}