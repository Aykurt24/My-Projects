package day10;

import java.util.Scanner;

public class ooo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a driver licence Yes or No");
        String str = input.nextLine();

        System.out.println("Speed:");
        int currentSpeed = input.nextInt();



        boolean a = str.contains("Yes") ;



        if (a == true){

            if (currentSpeed >= 55 && currentSpeed <= 74) {
                System.out.println("100");
            }else if (currentSpeed >= 75 && currentSpeed <= 84) {
                System.out.println("150");
            }else if (currentSpeed >= 85 && currentSpeed <= 94) {
                System.out.println("320");
            }else if (currentSpeed >= 94) {
                System.out.println("500");
            }

        }else if (a == false) {

            if (currentSpeed >= 55 && currentSpeed <= 74) {
                System.out.println("300");
            }else if (currentSpeed >= 75 && currentSpeed <= 84) {
                System.out.println("350");
            }else if (currentSpeed >= 85 && currentSpeed <= 94) {
                System.out.println("520");
            }else if (currentSpeed >= 94) {
                System.out.println("700");
            }

        }


    }
    }


