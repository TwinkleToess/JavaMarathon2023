package Marathon.Day8;

public class Task1_Task2 {
    public static void main(String[] args) {
        //<editor-fold desc="StringBuilder">
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for(int i=0; i<=20000; i++){
            sb.append(" "+i);
        }
        System.out.println(sb.toString());
        long stopTime = System.currentTimeMillis();
        long difference = stopTime - startTime;
        System.out.println("Длительность работы, в мс.: " + difference);
        //</editor-fold>

/*        long startTime = System.currentTimeMillis();
        String str = new String();
        for(int i = 0; i<=20000; i++){
            str = str+", "+i;
        }
        System.out.println(str.toString());
        long stopTime = System.currentTimeMillis();
        long difference = stopTime - startTime;
        System.out.println("Длительность работы, в мс.: " + difference);*/

        Airplane airplane = new Airplane("Russian airlines",2000,200,500);
        System.out.println(airplane);
    }
}
