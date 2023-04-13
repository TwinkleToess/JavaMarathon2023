package Marathon.Day7.task2;

import java.util.Random;

public class Football {
    public static void main(String[] args) {
        Random rand = new Random();

        Player kirill = new Player(rand.nextInt(11)+90);
        Player dima = new Player(rand.nextInt(11)+90);
        Player kolya = new Player(rand.nextInt(11)+90);
        Player petya = new Player(rand.nextInt(11)+90);
        Player andrey = new Player(rand.nextInt(11)+90);
        Player nikita = new Player(rand.nextInt(11)+90);

        Player forward = kirill;
        Player forward2 = dima;

        while(true){
            if (forward.stamina>0 || forward2.stamina>0){
                forward.run();
                forward2.run();
            }else {break;}
        }
        Player.info();



    }

}
