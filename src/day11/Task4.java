package day11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Provide month and year: ");
        String date = input.nextLine();

        String month = date.substring(0,1);

        int intmonth = Integer.valueOf(month);

        if (intmonth < 12 && intmonth > 0){
            System.out.println("Correct");
        }else {
            System.out.println("Wrong");
        }








    }
}
