package day6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();
        System.out.println("Your number is " + number1);

        System.out.println();

        System.out.println("Enter second  number");
        int number2 = input.nextInt();
        System.out.println("Your second number is " + number2);

        System.out.println();

        int sum = number1 + number2 ;
        System.out.println("Sum of Numbers is " + sum);

        int a,b;
        a=1;
        b=a;
        System.out.println("sum is " +a+b); // islem onceligi one
        System.out.println("sum is " +(a+b)); // we have to use () !!!!

    }



}
