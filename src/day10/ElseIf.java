package day10;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        /*

        else if -----> When your if statement is false than Java will look for the first else if statement

                 when your first else if is also false then java will look next else if statement.

                 when the condition is correct Java will not look other else statement


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your firs name: ");
        String name1 = input.nextLine();

        System.out.println("Enter your second name: ");
        String name2 = input.nextLine();

        int total = name1.length() + name2.length();

        if (total>15) {

            System.out.println("Your string is too long");
        } else if (total >10) {

            System.out.println("Your string is ok");
        } else if (total<5) {
            System.out.println("Your string is too short");
        }





    }
}
