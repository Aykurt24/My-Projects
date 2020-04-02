package day6;

public class StringIndexOf {

    public static void main(String[] args) {

        /*
        indexOf()
        Returns the position of the first found occurrence of specified characters
        in a string.

        int
         */

        String str = "Good";

        System.out.println("index of G: " + str.indexOf('G'));

        str = "Good morning";

        System.out.println(str.indexOf("mor")); // just giving starting cratcer!!

        System.out.println(str.indexOf("even")); // -1






    }
}
