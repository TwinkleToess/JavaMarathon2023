package Marathon.Day9.Task1;

public class Human implements Information{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    //<editor-fold desc="Getter">
    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем: " + name);
    }
    //</editor-fold>
}
