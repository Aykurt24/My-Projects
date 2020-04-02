package day4;

public class NarrowingCasting {

    public static void main(String[] args) {


        /* Narrowing Casting (manually) - converting a larger type to a smaller size type
         *
         * double - float - Long - int - char - short - byte
         *
         */

        double tax = 6.256;

        int roundedTax = (int) tax;

        System.out.println(tax);
        System.out.println(roundedTax);


    }
}
