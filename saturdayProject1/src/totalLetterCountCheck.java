import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line

        int countLetter = word.length();
        boolean odd = countLetter % 2 != 0;

        if (odd == true) {
            System.out.println(odd);
        }else {
            System.out.println("false");
        }


    }
}
