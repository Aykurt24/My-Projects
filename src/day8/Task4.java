package day8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       //1.way
        double number1 = Math.pow(2,2);
        double number2 = Math.pow(2,3);

        System.out.println("The square of 2 is " +number1);
        System.out.println("The cube of 2 is " +number2);


        System.out.println("---------------------------------");
        //2.way
        int a = 2;
        a *=2;
        System.out.println("The square of 2 is " + a);

        int b = 2;
        b *= 2;
        b *= 2;
        System.out.println("The cube of 2 is " + b);

        System.out.println("-----------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("num:");
        int num = input.nextInt();


        int square = num * num ;
        System.out.println("Square of " + num + " is: " + square);

        int cube = square * num ;
        System.out.println("Cube of " + num + "is: " + cube );

    }
}
