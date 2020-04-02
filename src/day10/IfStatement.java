package day10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your firs name: ");
        String name1 = input.nextLine();

        System.out.println("Enter your second name: ");
        String name2 = input.nextLine();

        if (name1.contains(name2)) {

            System.out.println("first String is containing second String");
        }

        if (name2.contains(name1)) {

            System.out.println("Second String is containing second String");
        }
    }
}
