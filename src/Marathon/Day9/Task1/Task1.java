package Marathon.Day9.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи имя преподавателя");
        String teacher_name = scan.next();
        Teacher teacher = new Teacher(teacher_name,"math");
        String student_name = scan.next();
        Student student = new Student(student_name, "math");
        teacher.printInfo();
        System.out.println("Введи имя студента");
        student.printInfo();


    }
}
