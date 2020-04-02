package day11;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {

        // how to get integer number from random.

        double r1 = Math.random();
        int r2 = (int) (r1 * 10);

        System.out.println("r1 double: " + r1);
        System.out.println("r2 integer: " + r2);

        Random random = new Random();
        int randomInt = random.nextInt(10);// bound should be integers
        System.out.println("RandomInt: " + randomInt);




    }
}
