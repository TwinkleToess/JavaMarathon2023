package Marathon.Day9.Task1;

import Marathon.Day6.School.Student;

import java.util.Random;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo() {
        System.out.println("Это преподаватель с именем: " + super.getName());
    }

    public void evaluate(Student studentName){
        Random rand = new Random();
        String mark = switch (rand.nextInt(4) + 2) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            default -> "отлично";
        };

        System.out.println("Преподаватель "+super.getName()+" оценил студента с именем "+studentName.getName()+
                " по предмету "+getSubjectName()+" на оценку "+mark+".");

    }


}
