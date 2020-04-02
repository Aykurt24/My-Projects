package day2;

import java.sql.SQLOutput;

public class JavaEscapeCharacters {

    public static void main(String[] args) {

        // new line -> \n
        System.out.println("Techno\nS\nt\nu\nd\ny");

        // quote -> \"
        System.out.println("\"Hi\"" );

        // tabulation -> \t
        System.out.println("\tHello Yakup" );

        // backslash -> \\
        System.out.println("\\Dogan" + "\n\\Yakup");

      long a = 3_000_000_000L;
        System.out.println(a);
    }
}
