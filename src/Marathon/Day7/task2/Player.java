package Marathon.Day7.task2;

public class Player {
    int stamina;
    public Player(int stamina) {
        this.stamina = stamina;
        if(counter<6) {
            counter++;
        }else{info();}
    }

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int counter;
    public static int getCounter() {
        return counter;
    }
    public int getStamina() {
        return stamina;
    }

    public void run(){
        stamina--;
        if (stamina<=MIN_STAMINA){
            counter--;
        }
    }
    public static void info(){
        int free = 6-counter;
        if(counter<6){
            System.out.println("Команды неполные. На поле еще есть " + free + " свободных мест");
        }else{
            System.out.println("На поле нет свободных мест.");
        }
    }

}
