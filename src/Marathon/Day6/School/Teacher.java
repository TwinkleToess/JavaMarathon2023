package Marathon.Day6.School;

import java.util.Random;

public class Teacher {
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
            default -> "отлично";
        };

        System.out.println("Преподаватель "+name+" оценил студента с именем "+studentName.getName()+" по предмету "+subject+" на оценку "+mark+".");

    }


}
