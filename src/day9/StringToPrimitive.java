package day9;

public class StringToPrimitive {
    public static void main(String[] args) {

        // $2.99
        // $7.99

        String str1 = "2.99";
        String str2 = "7.99";

        double price1 = Double.parseDouble(str1);
        double price2= Double.parseDouble(str2);

        System.out.println("Total Price: " + (price1+price2));

        // to double

        double decimal1 = Double.parseDouble("10.22");
        double decimal2 = Double.parseDouble("10.22");
        System.out.println("doubles: " + (decimal1 == decimal2));

        // to integer

        int integer1 = Integer.parseInt("65");
        int integer2 = Integer.valueOf("65");
        System.out.println("integers: " + (integer1 == integer2));



        // string to boolean

        boolean b1 = Boolean.parseBoolean("true");
        boolean b2 = Boolean.valueOf("true");
        boolean b3 = b1 == b2 ;
        System.out.println("Booleans " + (b1 == b2));

        // string to float

        float f1 = Float.parseFloat("8.99");
        float f2 = Float.valueOf("8.99");
        System.out.println("floats: " + (f1 == f2));

        //



        // everything to string

        // String str0 = String.valueOf(decimal1);
        //String str1 = Double.toString

    }
}
