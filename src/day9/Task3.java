package day9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the price for 2 items");
        String price1 = input.nextLine();
        String price2 = input.nextLine();

        String item1 = price1.substring(1); //replace ("$"   ""),
        String item2 = price2.substring(1);

        double priceOfItem1 = Double.parseDouble(item1);
        double priceOfItem2 = Double.valueOf(item2);

        double total = priceOfItem1 + priceOfItem2;
        System.out.println("Total is $" + total );


    }
}
