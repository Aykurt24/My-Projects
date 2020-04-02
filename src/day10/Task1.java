package day10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name1 = input.nextLine();
        int length1 = name1.length();

        System.out.println("----------------------------");

        System.out.println("Enter your Second name: ");
        String name2 = input.nextLine();
        int length2 = name1.length();

        int total = length1 + length2;

        System.out.println("-----------------------------");

        if (length1+length2>15) {

            System.out.println("Your string is too long");
        }

        if (length1+length2<15){

            System.out.println("Your string is ok");
        }





    }
}
