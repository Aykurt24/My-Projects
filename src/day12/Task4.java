package day12;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*
        int number = (int) (Math.random()*6);
        System.out.println(number);
        if (number == 5){
            System.out.println("Five");
        }else if (number == 4){
            System.out.println("Four");
        }else if (number == 3) {
            System.out.println("Three");
        }else if (number == 2) {
            System.out.println("Two");
        }else if (number == 1) {
            System.out.println("One");
        }else if (number == 0) {
            System.out.println("Zero");

 */
        Random random = new Random();
        int number = random.nextInt(6);
        System.out.println("Number: " + number);

        switch (number){
            case 0:
                System.out.println("it is zero");
                break;
            case 1:
                System.out.println("it is one");
                break;
            case 2:
                System.out.println("it is two");
                break;
            case 3:
                System.out.println("it is three");
                break;
            case 4:
                System.out.println("it is four");
                break;
            case 5:
                System.out.println("it is five");
                break;
        }



    }
}
