package day7;

public class Task2 {
    public static void main(String[] args) {

        String name = "Dogan";
        String surname = "Aykurt";

        name = name.toUpperCase();
        surname = surname.toLowerCase();

        System.out.println("My full name is  " + name.toUpperCase() +" "+ surname.toLowerCase());
        System.out.println();
        System.out.println(name + " " + surname);
        System.out.println();
        System.out.println(name.concat(" ").concat(surname));
        //
    }
}
