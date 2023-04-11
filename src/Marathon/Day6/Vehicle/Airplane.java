package Marathon.Day6.Vehicle;

public class Airplane {
    String manufacturer;

    int year;
    int length;
    int weight;
    int fuel;

    Airplane(String manufacturer, int year, int length, int weight) {
        int fuel = 0;
        this.manufacturer = manufacturer;
        this.year = year;
        this.weight = weight;
        this.length = length;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year + " , длина: " + length +
                ", вес: " + weight + ", количество топлива в баке:" + fuel);
    }

    public void fullUp(int n) {
        this.fuel += n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public  void setWeight(int weight) {
        this.weight = weight;
    }

}
