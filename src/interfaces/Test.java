package interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Kirill");
        Person kirill = new Person("Kirill");

        outputInfo(kirill);


    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }


}

