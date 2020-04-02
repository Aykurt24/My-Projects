package day5;

import java.util.Scanner;

public class Scanner1 {

    // String -> texts
    // byte -> whole numbers
    // short -> whole numbers
    // int -> whole numbers
    // Long -> decimal numbers
    // boolean -> true false
    // double -> decimal numbers
    // float -> decimal numbers
    // char -> character

    /*


    Scanner:
        Scanner is a class for getting the input of the primitive types like int, boolean,
            String. It is the easiest way to read input in the java programing.

     */

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your name: ");

        String name  = input.nextLine();

        System.out.println("Your user name is " + name);

        System.out.println();

        System.out.println("Enter your last name:");

        String lastName = input.nextLine();

        System.out.println("Your last name is " + lastName);









    }





}
