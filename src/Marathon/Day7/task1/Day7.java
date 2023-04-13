package Marathon.Day7.task1;

public class Day7 {
    public static void main(String[] args) {
        Airplane Russian = new Airplane("Russian Airlines", 2012, 2000, 10000);
        Airplane Foreign = new Airplane("Foreign Airlines", 2020, 4000, 900);

        Airplane.compareAirplanes(Russian, Foreign);
    }
}
