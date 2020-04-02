package day5;
import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {

        // Create one int and enter your monthly spend print the number

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your montly spend:");
        int montlySpend = input.nextInt();
        System.out.println("Your montly spend is " + montlySpend);

        //String , int
        System.out.println();
        // double

        System.out.println("Enter your montly spend in decimal");

        double montlySpendInDecimal = input.nextDouble();

        System.out.println("Your montly spend in decimal is " + montlySpendInDecimal);



        // crearte one double and which is salary and print that salary
        System.out.println();

        System.out.println("Enter your salary wiht decimal: ");

        double salary = input.nextDouble();

        System.out.println("Your salary is " + salary);







    }
}
