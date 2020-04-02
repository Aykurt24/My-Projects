package day4;

public class WideningCasting {

    public static void main(String[] args) {

        /* widening casting (automatically) -
         converting a smaller type to a larger type size
        byte - short - char - int - long - float - double
         */
        int num = 9;
        double decimal = num;

        System.out.println(num);
        System.out.println(decimal);


    }
}
