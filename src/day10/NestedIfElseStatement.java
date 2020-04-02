package day10;

import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {

        /*

        If there is a if statement in the if statement then it will call as a method if statement

         */

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();

        if (number1 > 10) {

            if (number1 < 30) {

                System.out.println("Number is more than 10 less than 30");

            } else if (number1 < 40) {

                System.out.println("Number is more than 10 less than 40");

            }


        } else if (number1 > 5) {

            System.out.println("Number is more than 5");

        }


    }


}

