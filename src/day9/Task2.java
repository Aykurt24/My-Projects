package day9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        String text = input.nextLine();

        int a = Integer.parseInt(text);
        a += 100;
        System.out.println("Number is " + a);






    }
}
