package Marathon.Day6.Vehicle;

public class Car {
    private String model;
    private String color;
    private int year;


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if(inputYear<year){
            return 0;
        }else{return inputYear - year;}
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
