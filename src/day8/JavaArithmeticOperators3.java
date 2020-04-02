package day8;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {

        int i = 1;
        ++i; // 1 + 1
        ++i; // 2 + 1
        ++i; // 3 + 1
        System.out.println(i);



        /*

        ++: increment

        --: decrement


         */

        int x;
        int y;

        // increment operators
        // Pre-increment - x is incremented by 1 ,  then y is assigned the value of x

        x = 1;
        y = ++x; // x is now 2, y is also 2
        System.out.println("\nPre-increment: x= " + x + " y= " + y);
        // Post-increment - y is assigned the value of x, then is incremented by 1

        x = 1;
        y = x++; // x is now 2, y is also 1
        System.out.println("\nPost-increment: x= " + x + " y= " + y);

        //Decrement operators
        // Pre-decrement - x is decremented by 1 , then y is assigned value of x

        x = 1;
        y = --x; // x is now 0, y is also 0
        System.out.println("\nPre-decrement: x= " + x + " y= " + y);

        // Post-decrement - y assigned the value of x, the x is decremented by 1

        x = 1;
        y = x--; // x is now 0, y is 1
        System.out.println("\nPost-decrement: x= " + x + " y= " + y);

        int a = 10;
        int b = a + ++a + a++ + --a - a--;
        System.out.println("\n"+b);






    }
}
