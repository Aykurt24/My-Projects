package day10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 number :");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int reminder = number1%number2;

        if (number1 > number2) {

            if (reminder == 4) {
                System.out.println(number1 +" divide by " + number2 + "reminder is 4");

            } else if (reminder == 3) {
                System.out.println(number1 +" divide by " + number2 + "reminder is 3");

            } else if (reminder == 2) {
                System.out.println(number1 +" divide by " + number2 + "reminder is 2");

            } else if (reminder == 1) {
                System.out.println(number1 +" divide by " + number2 + "reminder is 1");


            } else if (reminder == 0) {
                System.out.println(number1 +" divide by " + number2 + "reminder is 0");

            }

        } else if (number1 == number2) {

            System.out.println(number1 +" divide by " + number2 + "reminder is 0");


        } else {
            System.out.println("Number1 must be greater than Number 2");
        }







        }
}
