package Polymorphism;

public class Test29 {
    public static void main(String[] args) {

/*
        //Upcasting - восходящее преобразование
        Animal animal = new Dog();
        Dog dog = new Dog();
        animal.eat();

        //Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();
*/

        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();


    }

}
