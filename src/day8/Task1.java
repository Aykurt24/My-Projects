package day8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a = 1, b= 2, c= 3, d= 4 ;
        System.out.println("Answer is " + (a*b*c*d));

        System.out.println("\nEnter the 4 numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int answer = n1*n2*n3*n4;

        System.out.println("Answer is " + answer);

    }
}
