package day5;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your address:");

        String address = input.nextLine();

        System.out.println("Your address is : " + address);

        System.out.println();

        // how to store in thr int -> nextInt.

        System.out.println("Enter your zipcode: ");

        int zipCode = input.nextInt();

        System.out.println("Your Zipcode : " + zipCode);

        // Create city name

        System.out.println();

        input.nextLine();

        System.out.println("Enter your city : ");

        String city = input.nextLine();

        System.out.println("Your current city is " + city);

        // Create your age

        System.out.println();

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        System.out.println("Your age is " + age);

        // Create country

        System.out.println();

        input.nextLine();

        System.out.println("Enter the country name: ");

        String country = input.nextLine();

        System.out.println("Your country is " + country);




    }






}
