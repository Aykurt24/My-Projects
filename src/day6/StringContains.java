package day6;

public class StringContains {

    public static void main(String[] args) {

        /*

        Checks whether a string contains a sequence of characters

        boolean
         */

        String str1 = "Hello";

        System.out.println("Does Hello contains llo " + str1.equals("llo" ) );
        System.out.println("Does Hello contains eo " + str1.contains("eo" ) );


    }


}
