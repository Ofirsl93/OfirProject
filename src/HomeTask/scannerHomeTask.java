package HomeTask;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class scannerHomeTask {
    public static void main(String[] args) {

Scanner Tal = new Scanner(System.in);
        System.out.println("enter your name ");
String Name = Tal.nextLine();
System.out.println("this is my name " + Name);

        System.out.println("please enter your last name");
        String lastname = Tal.nextLine();
        System.out.println("this is my last name " + lastname);

        System.out.println("please enter your address");
        String address = Tal.nextLine();
        System.out.println("this is my address " + address);

        System.out.println("please enter score average");
        String scoreaverage = Tal.nextLine();
        System.out.println("this is my score " + scoreaverage);

        System.out.println("please enter age");
        String age = Tal.nextLine();
        System.out.println("this is my age " + age);

    }
}
