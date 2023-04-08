public class Classes_and_objects {
    public static void main(String[] args) {
        // Класс - это шаблон.
        Person person1 = new Person();
        person1.name = "Роман";
     person1.age = 50;

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);

    }
    /*Публичный класс может быть только 1. Имя публичного класса должно соответствовать имени .java файла*/
    /*
    У класса могут быть:
            1. Данные (поля)
            3. Действия, которые он может совершать (методы)
    */
    static class Person{
        String name;                    /*У всех объектов класса Person будет имя*/
        int age;                        /*У всех объектов класса Person будет возраст*/
    }

}


