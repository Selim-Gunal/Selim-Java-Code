import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generateRandom = new Random();

        int random1 = generateRandom.nextInt(100) + 1;
        int random2 = generateRandom.nextInt(100) + 1;
        int random3 = generateRandom.nextInt(100) + 1;
        int random4 = generateRandom.nextInt(100) + 1;
        int random5 = generateRandom.nextInt(100) + 1;

        if (random1 % 2 == 1){
            System.out.println(random1);
        }

        if (random2 % 2 == 1){
            System.out.println(random2);
        }

        if (random3 % 2 == 1){
            System.out.println(random3);
        }

        if (random4 % 2 == 1){
            System.out.println(random4);
        }

        if (random5 % 2 == 1){
            System.out.println(random5);
        }
    }
}