package day5;

import java.util.Scanner;

public class Scanner5 {

    public static void main(String[] args) {

        /*

        How to write in string, int, and double;


         */

        // boolean -> true and false

        // create one boolean and do you want an insurance print  the boolean

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want an insurance ? ");

        boolean insurance = input.nextBoolean();

        System.out.println("Do you want an insurance : " + insurance);

        System.out.println();

        // Create boolean do you want a two way ticket ?

        System.out.println("Do you want a two way ticket ");

        boolean twoWay = input.nextBoolean();

        System.out.println("Do you want a two way ticket : " + twoWay);



    }

}

