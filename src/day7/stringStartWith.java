package day7;

public class stringStartWith {

    public static void main(String[] args) {

        /*
        startwith()
        Checks whether a string starts with specified characters boolean
         */

        String text = "General Chat";

        System.out.println("is text starts with gener: " + text.startsWith("gener"));
        System.out.println("is text starts with Gener: " + text.startsWith("gener"));
        System.out.println("is text starts with G: " + text.startsWith("G"));
        System.out.println("is text starts with Chat: " + text.startsWith("chat"));

    }


}
