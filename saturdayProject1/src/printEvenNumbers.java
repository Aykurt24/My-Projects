import java.util.Scanner;

public class printEvenNumbers {

    /*
    Given int number

    print all the even numbers from 0 to int number


    Example 1:
    int input = 10;

    print should be 0 2 4 6 8 10


    Example 2:
    int input = 15;

    print should be 0 2 4 6 8 10 12 14


     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();

        //  code Start here don't change before this line

        int counter = 0;


        for(int i = 0; i <= maxNum; i++){

            counter++;

            if (i % 2 == 0){

                System.out.print(" "+i);


            }





        }


    }

}
