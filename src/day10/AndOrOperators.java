package day10;

import java.util.Scanner;

public class AndOrOperators {

    public static void main(String[] args) {

        /*

        AND both conditions must be true  &&

         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String name = input.nextLine();

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        if (name.contains(password) && password.length()<5) {

            System.out.println("Your password is not accepted");
        }

         /*

        OR one of conditions must be true ||

         */

        //int num1 = 15;

       // if (num1 > 10 || num1<15){
          //  System.out.println("My number is " + num1);
       // }
    }
}
