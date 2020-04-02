package day12;


import java.util.Scanner;

public class JavaSwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide exam result of student [A, B, C, D, F]: ");
        String examResult = input.nextLine();
        String examMark = "";

        switch (examResult) {
            case "A":
                examMark = "Excellent!!!";
               // System.out.println("Excellent!!!");
                break;
            case "B":
                examMark = "Well done";
                // System.out.println("Well done");
                break;
            case "C":
                examMark = "Good";
               // System.out.println("Good");
                break;
            case "D":
                examMark = "Need improvement";
                //System.out.println("need improvement");
                break;
            case "F":
                examMark = "Fail";
                //System.out.println("Fail");
                break;
        }




        }


    }

