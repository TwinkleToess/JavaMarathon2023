import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            String mark = null;
            switch (rand.nextInt(4) + 2) {
                case 2:
                    mark = "неудовлетворительно";
                case 3:
                    mark = "удовлетворительно";
                case 4:
                    mark = "хорошо";
                case 5:
                    mark = "отлично";


            }

        }
    }
}
