import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];


        // we are starting to write our code from that point

        int numOne= Integer.valueOf(num1.replace("$",""));
        int numTwo= Integer.valueOf(num2.replace("$",""));
        int numThree= Integer.valueOf(num3.replace("$",""));

        int total = numOne + numTwo + numThree;

        if (total >= 0) {
            System.out.println(total);
        }else if (total < 0) {
            System.out.println("-1");
        }










    }
}
