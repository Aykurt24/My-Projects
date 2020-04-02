package day8;

public class JavaAssignmentOperators {
    public static void main(String[] args) {
        int i = 5;

        i += 5 ;
        System.out.println("i+=5 is " + i);

        // *= Sub assignment

        int j = 10;

        j -= 3;
        System.out.println("j-=3 is " + j);


        // *= Multiplication assignment
        int k = 3;

        k *= 3;
        System.out.println("k*=3 is " + k);

        // /= Division assignment

        int x = 12;
        x /= 4;
        System.out.println("x/=4 is " + x);

        // %= Remainder assignment

        int m = 7;
        m %= 5;
        System.out.println("x%=5 is " + m);

    }
}
