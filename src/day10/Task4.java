package day10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your budget: ");
        int budget = input.nextInt();

        if (budget>=7500){
            System.out.println("You can travel anywhere in the world");
        }else if(budget<7500 && budget>=5000){
            System.out.println("You can travel anywhere except Austraila ");

        }else if(budget<5000 && budget>=3000){
            System.out.println("You can travel USA and Europe ");

        }else if(budget<3000){
            System.out.println("Stay at home");
        }

    }

}
