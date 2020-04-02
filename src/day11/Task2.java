package day11;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number between 0 to 3");
        int guess = input.nextInt();

        Random random = new Random();
        int number = random.nextInt(4);// bound should be integers
        System.out.println("\nNumber: " + number);

        if (guess == number) {
            System.out.println("You Won the Game");

        }else {
            System.out.println("Game Over!!!");
        }



    }
}
