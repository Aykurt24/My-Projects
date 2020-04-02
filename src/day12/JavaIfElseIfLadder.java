package day12;

public class JavaIfElseIfLadder {
    public static void main(String[] args) {

        // when we use if else statements we gonna execute our code and
        // until getting what we want it will not stop. When it stop, we
        // will have only one statement as a out put.
        // { most of time new programmer forgetting put open {  and  close }

        int age = 20;

        if (age > 10 ) {
            System.out.println("age is greater than 10");
        } else if (age > 15) {
            System.out.println("age is greater than 15");
        } else if (age == 20) {
            System.out.println("age is equal to 20");
        }
    }
}
