package day7;

public class StringReplaceAll {
    public static void main(String[] args) {

        /*
        replaceAll()

        Replaces each substring of this string that matches
        the given regular expression with the given replacement

        String
         */

        String text = "Edit the Expression & Text to see matches";
        System.out.println(text);
        System.out.println("---------------------------------------");
        System.out.println(text.replaceAll("[A-Z]","THE "));
        System.out.println("---------------------------------------");
        System.out.println(text.replaceFirst("[A-Z]","THE "));
    }
}
