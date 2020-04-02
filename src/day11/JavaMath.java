package day11;

import java.util.jar.JarOutputStream;

public class JavaMath {
    public static void main(String[] args) {

        // Math.abs provides us positive numbers.
        System.out.println("abs: " + Math.abs(-10));

        // Math.max (a,b) provides big number in between a and b.
        System.out.println("\nmax: " +Math.max(5,11));

        // Math.min (a,b) provides small number in between a and b.
        System.out.println("min: " + Math.min(-5,-90));

        // Math.round (a)
        System.out.println("\nround of 3.1: " + Math.round(3.1));
        System.out.println("round of 3.5: " + Math.round(3.5));

        // Math.ceil (a)

        System.out.println("\nceil of 3.1: " + Math.ceil(3.1));
        System.out.println("ceil of 3.5: " + Math.ceil(3.5));

        // Math.floor (a)

        System.out.println("\nfloor of 3.1: " + Math.floor(3.1));
        System.out.println("floor of 3.5: " + Math.floor(3.5));

        // Math.sqrt(a)

        System.out.println("\nsqrt of 4: " + Math.sqrt(16));

        // Math.pow

        System.out.println("\npow of (3,2): " + Math.pow(3,2));
        System.out.println("pow of (2,4): " + Math.pow(2,4));

        // Math.random

        System.out.println("\nrandom: " + Math.random());






    }

}
