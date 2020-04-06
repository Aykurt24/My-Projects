import java.util.Scanner;

public class age {

     /*
        Given a int ,
            if the age less then 10
                print  too young to create a Facebook account

             if the age less then 16
                print  too young to get a driver's license

             if the age less then 18
                print  too young to get a tattoo

            if the age less then 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do


     */



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 10 ){
            System.out.println("too young to create a Facebook account");
        }else if (age < 16 ) {
            System.out.println("too young to get a driver's license");
        }else if (age < 18) {
            System.out.println("too young to get a tattoo");
        }else if (age < 21) {
            System.out.println("too young to drink alcohol");
        }else if (age >= 21) {
            System.out.println("do what ever you want to do");
        }


    }
}
