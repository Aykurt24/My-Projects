package day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many rooms you need");
        int room = input.nextInt();

        if (room > 3) {

            System.out.println("We do not have any apartment more than 3 rooms");

        }else if (room == 3) {

            System.out.println("Rent is $2500");
        }else if (room == 2) {

            System.out.println("Rent is $2000");
        }else if (room == 1) {

            System.out.println("Rent is $1500");
        }else if (room == 0) {

            System.out.println("Rent is $1300");
        }





    }
}
