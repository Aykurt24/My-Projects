package day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your weigth in Kg");
        double weigth = input.nextDouble();

        System.out.println("Enter your heigth in m");
        double heigth = input.nextDouble();

        double BIM = (int) (weigth/Math.pow(heigth,2)*10)/10.0;

        System.out.println("Your BIM is " + BIM);

        System.out.println("-----------------------------------");
        // part2

        int number = 12345;
        int five , four, three, two, one ;

        five = number % 10;
        four = number % 100;
        four /= 10;
        three = number % 1000;
        three /= 100;
        two = number % 10000;
        two /= 1000;
        one = number % 100000;
        one /= 10000;

        System.out.println("The number is " + number );
        System.out.println("------------------------------");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);


    }
}
