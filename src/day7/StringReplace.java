package day7;

public class StringReplace {
    public static void main(String[] args) {
        /*
        replace()
        Search a string for a specific value,
        returns a new string where the specified values are replaced
        String
         */

        String text = "Hello World!!";

        System.out.println("before changing: " + text);
        System.out.println("------------------------------------");
        System.out.println("changing o with A: " + text.replace("o", "A"));
        System.out.println("------------------------------------");
        System.out.println("changing Hello with Bonjour: ");
        System.out.println("------------------------------------");
        System.out.println("changing  with A: " + text.replace("o", "A"));

    }
}
