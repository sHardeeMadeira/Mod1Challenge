package madeira.cs;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String first = "Susanna"; String middle = "Lynn"; String last = "Hardee";
        System.out.println(first); System.out.println(middle); System.out.println(last);


        System system = null;
        system.out.print ("hello \n" + "world");

        System system1 = null;
        system1.out.print ("\nI am 15 years old");


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


