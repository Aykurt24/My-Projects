package day6;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name length is " + name.length());

        System.out.println();

        System.out.println("Enter your latname: ");
        String lastname = input.nextLine();
        System.out.println("Your lastname length is " + lastname.length());

        System.out.println();

        int number1 = name.length();
        int number2 = lastname.length();

        System.out.println("Sum of your length of name and lastname is " + (number1 + number2) );

        // 2 way
        System.out.println("------------------------------------------------");




    }


}
