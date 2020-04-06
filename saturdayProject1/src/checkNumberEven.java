import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int check the number is even or not

        if the number is even print true

        result should be true or false.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean even = number % 2 == 0 ;

        if (even == true) {
            System.out.println(even);
        }else {
            System.out.println("false");
        }



    }
}
