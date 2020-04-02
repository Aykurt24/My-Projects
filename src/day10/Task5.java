package day10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many star do you have?");
        String star = input.nextLine();
        String stars = star.replaceAll("[^\\d]","");
        int numberOfStar = Integer.valueOf(stars);

        System.out.println("How far from the downtown");
        int miles = input.nextInt();

        if (numberOfStar < 3 && miles > 5 ) {

            System.out.println("Hotel is too far from city and it is not good");

        }else if (numberOfStar>=3 && miles<= 5 ){

            System.out.println("This hotel is perfect");
        }
    }
}
