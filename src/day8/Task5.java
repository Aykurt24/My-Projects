package day8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius : ");

        double celsius = input.nextDouble();

        double fahrenheit = ((5.0/9)* celsius) + 32;

        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");

    }
}
