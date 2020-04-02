package day11;

public class JavaTernaryOperator {
    public static void main(String[] args) {
        int speed = 40;

        int fine;

      //  if(speed > 25) {
            fine = 5;
       // }else {
            fine = 0;
      //  }
        fine = speed > 25 ? 5 : 0 ;

        //variable = (condition) ? true output : false output;
    }
}
