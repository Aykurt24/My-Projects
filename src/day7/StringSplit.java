package day7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        /*
        Split()

        Splits a string into an array of substrings

        String[]
         */

        String text = "Good evening everybody";
        System.out.println("orginal: " + text);
        System.out.println("after split wiht ' "+ Arrays.toString(text.split(" ")));
        System.out.println("------------------------------------");

        text = "Good @ evening @ everybody";

    }
}
