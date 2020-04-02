package day6;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name: ");
        String name = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastname = input.nextLine();
        System.out.println(name.substring(0,1) + "." + lastname.substring(0,1) + ".");

        // part2


        String mJ = "Michael Jockson";
        char a = mJ.charAt(0);
        int c = a;
        System.out.println(a);
        char b = mJ.charAt(8);
        int d = b;
        System.out.println(b);
        System.out.println(mJ.substring(c));
        System.out.println(mJ.substring(d));


    }


}
