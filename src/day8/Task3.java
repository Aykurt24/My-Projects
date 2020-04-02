package day8;

public class Task3 {
    public static void main(String[] args) {

        // 1.way

        double a = 23.4, b = 24.0, c = 450.3;
        int d = 12, e = 23000;

        double average = (a+b+c+d+e)/5;
        System.out.println("average is " + average);

        // part 2
        double number1 = 23.4;
        number1 += 24.0;
        number1 += 450.3;

        int number2 = 12;
        number2 += 23000;

        double avg = (number1 + number2) /5;
        System.out.println("\naverage2 is " + avg);

    }
}
