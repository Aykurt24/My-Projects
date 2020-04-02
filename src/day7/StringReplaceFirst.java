package day7;

public class StringReplaceFirst {
    public static void main(String[] args) {

        /*
        Search a string for a specified
         */

        String text = "Edit the Expression & Text to see matches";
        System.out.println(text);
        System.out.println("---------------------------------------");
        System.out.println(text.replaceAll("[A-Z]","THE "));
        System.out.println("---------------------------------------");
        System.out.println(text.replaceFirst("[A-Z]","THE "));
        System.out.println("------------------------------------------");
        System.out.println(text.replace("[A-Z]","THE ")); // you have to give specific target for replace


    }
}
