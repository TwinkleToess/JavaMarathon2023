package Marathon.Day9.Task1;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        System.out.println("Это студент с именем: " + super.getName());
    }

}
