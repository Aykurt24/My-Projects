package day8;

public class JavaArithmeticOperators1 {
    public static void main(String[] args) {
        int a = 8 ;
        int b = 4 ;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        //+

        System.out.println("plus, addition");
        System.out.println("a+b= " + (a+b));
        System.out.println("5+2= " + (5+2));

        System.out.println("------------------------");

        //-
        System.out.println("minus, subtract");
        System.out.println("a-b= " + (a-b));
        System.out.println("5-2= " + (5-2));

        System.out.println("------------------------");

        //-negation
        System.out.println("b after negation: " + (-b) );
        a = -a; // reassign with negate variable
        System.out.println("a after negation: " + a);



    }
}
