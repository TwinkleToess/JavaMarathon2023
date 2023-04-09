package Marathon.Day6;

import java.util.Random;

public class task3_day6 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Student student1 = new Student();

        teacher1.evaluate(student1);



    }

}

class Student{

    String name;

    Student() {
        this("Мирон");
    }
    Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Teacher{

    String name;
    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    Teacher() {
        this("Евгения","Английский язык");
    }

    public void evaluate(Student studentName){
        Random rand = new Random();
        String mark = switch (rand.nextInt(4) + 2) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> null;
        };

        System.out.println("Преподаватель "+name+" оценил студента с именем "+studentName.getName()+" по предмету "+subject+" на оценку "+mark+".");

    }





}