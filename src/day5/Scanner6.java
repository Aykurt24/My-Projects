package day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner6 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

    // byte max 127 min -128

        System.out.println("How many tickets you want ? ");

        byte totalTicketCount = input.nextByte();

        System.out.println("answer for the ticket count is " + totalTicketCount);

        System.out.println();
    // short

        System.out.println("Total amount of the tickets");

        short totalTicket = input.nextShort();

        System.out.println("Total amount of the tickets is " + totalTicket + "$");

    // char --> we are not able to use the char

        System.out.println();
    // float --> nextFloat()

        System.out.println("Singel ticket price ");

        float singleTicket = input.nextFloat();

        System.out.println("Single ticket price : " +singleTicket);

/*

    Scanner Class
        We are able to type in the console
            we can also print it


         String  ---> nextLine()
         int     ---> nextInt()
         boolean ---> nextBoolean()
         byte    ---> nextByte()
         short   ---> nextShort()
         float   ---> nextFloat()

 */

// String user name and string last name print it in the one line

        System.out.println("Enter your name ");
        String name = input.nextLine();

        System.out.println("Enter your last name");
        String lastname = input.nextLine();

        System.out.println("Name : " + name + "last name : " + lastname);
















    }
}
