package day11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost price:");
        int costprice = input.nextInt();

        System.out.println("Enter the selling price:");
        int sellingprice = input.nextInt();

        // 1 way
        int total = sellingprice - costprice;

        //if (total > 0) {
           // System.out.println("Profit: " + total);
       // }else {
        //    System.out.println("Loss: " + Math.abs(total));
       //     System.out.println("Loss: " + (-total));
       // }

        //  2.way

        String profitOrLoss = total >= 0 ? "Profit" : "Loss" ;
        System.out.println(profitOrLoss +" "+Math.abs(total));
    }
}
