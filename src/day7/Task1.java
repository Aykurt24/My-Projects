package day7;

public class Task1 {
    public static void main(String[] args) {
        String text = "Hello Java!!!";

        System.out.println("is text starts with Hello: " + text.startsWith("Hello"));
        System.out.println("is text starts with Hi: " + text.startsWith("Hi"));
        System.out.println("---------------------------------------------------------------");
        System.out.println("is text starts with Hello and ends with !!!: " + text.startsWith("Hello") + text.endsWith("!!!"));



    }
}
