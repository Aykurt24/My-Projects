package day5;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

     // Scanner let us to type in the console

     // Create one string and store the email and print your email.

        System.out.println("Enter your email: ");

        String email = input.nextLine();

        System.out.println("Your email is " + email);

        System.out.println();
     // Create one int and store the total count of your family members

        System.out.println("Enter number of family member:");
        int number = input.nextInt();
        System.out.println("Your number of family member: " + number);

        System.out.println();
     // Create one String and store the name of your player and print them

        input.nextLine();
        System.out.println("Enter name of your favorite player: ");
        String player = input.nextLine();
        System.out.println("Your favorite player name is " + player);







    }



}
