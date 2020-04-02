package day12;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // with scanner
        Scanner input = new Scanner(System.in);

        // with random
       // String grade = "ABCDF";
        //Random rand = new Random();
       // char letter = grade.charAt(rand.nextInt(5));
       // System.out.println();
        //String result = letter + " ";

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        if (score >87 ) {
            System.out.println("Your grade is A");
        }else if (score >77 && score <= 87) {
            System.out.println("Your grade is B");
        }else if (score >67 && score <= 77) {
            System.out.println("Your grade is C");
        }else if (score >57 && score <= 67) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }

        System.out.println("------------------------");
        //2.way
        System.out.println("Enter your grade: ");
        String grade = input.nextLine();

        if (grade.equals("A")) {
            System.out.println("Excellent");
        }else if (grade.equals("B")) {
            System.out.println("Well done");
        }else if (grade.equals("C")) {
            System.out.println("Good");
        }else if (grade.equals("D")) {
            System.out.println("Need improvement");
        }else if (grade.equals("F")) {
            System.out.println("Fail");
        }else {
            System.out.println("Not valid input");
        }
    }
}
