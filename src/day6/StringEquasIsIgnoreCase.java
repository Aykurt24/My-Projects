package day6;

public class StringEquasIsIgnoreCase {

    public static void main(String[] args) {

        /*
        Compares two strings, ignoring case considerations

        boolean
         */

        String str1 = "Hello";

        System.out.println("is Hello same as Hello " + str1.equalsIgnoreCase("Hello"));
        System.out.println("is Hello same as Hello " + str1.equalsIgnoreCase("hello"));




    }

}
