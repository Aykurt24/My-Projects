package day2;

public class Task5 {

    public static void main(String[] args) {
        // 1 way
        int total;
        int priceForOil = 1;
        int priceForWater = 2;
        int priceForBook= 3;
        int priceForPen= 4;
        total = priceForBook+priceForOil+priceForPen+priceForWater;

        System.out.println("price of Oil is " + priceForOil + " dolars");
        System.out.println("price of Water is " + priceForWater + " dolars");
        System.out.println("price of Book is " + priceForBook + " dolars");
        System.out.println("price of Pen is " + priceForPen + " dolars");
        System.out.println("Total prices of items = " + total+" dolars");

        System.out.println();

        // 2 way

        int totalPrice, oil, water, book, pen ;
        oil = 10;
        water = 20;
        book = 30;
        pen = 40;
        totalPrice = oil+pen+water+book;

        System.out.println();

        System.out.println("price of Oil is " + oil + " dolars");
        System.out.println("price of Water is " + water + " dolars");
        System.out.println("price of Book is " + book + " dolars");
        System.out.println("price of Pen is " + pen + " dolars");
        System.out.println("Total prices of items = " + totalPrice+" dolars");

        // defining variable in single line

        int a = 1, b =2;

        // naming of variables
        // int 10number = 10; you cannot start with number
        int number10 = 10;

        // What symbol can be used in java as variable name??
        int $ = 100;
        int number_ = 100; // avoid starting variable with underscore




    }
}
