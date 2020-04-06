import java.util.Scanner;

public class perfectSquare {


    /*
    Given a positive integer num, write a function which returns True if num is a perfect square else False.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25


        Example 2:
        Input: 14
        Output: false

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        boolean a = true;
        for (int i = 1; i < input; i++) {
            if (input == i * i) {
                a = true;
                break;
            } else {
                a = false;
            }
        }
        System.out.println(a);
    }
}




