package day12;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        boolean leapYear = year % 4 == 0;

        leapYear = leapYear && year %100 != 0 ;
        leapYear = leapYear || year % 400 ==0 ;

        if (leapYear){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
    }
}
