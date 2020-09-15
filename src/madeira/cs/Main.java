package madeira.cs;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Good thought here but the correct answer is to use the .print() method so it PRINTS on one line
        String first = "Susanna"; String middle = "Lynn"; String last = "Hardee";
        System.out.println(first); System.out.println(middle); System.out.println(last);

        // Interesting declaration of System here. Not necessary but not bad
        System system = null;
        system.out.print ("hello \n" + "world");

        System system1 = null;
        system1.out.print ("\nI am 15 years old");


        // The goal is to get you to guess! You need to compare the name to your name and
        // print the result of the boolean comparison
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String Susanna = myScanner.next();
        System.out.print("Input your last name: ");
        String Hardee = myScanner.next();

        int i = 9;
        int x = 8;
        int j = 5;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);

        



















    }
}


