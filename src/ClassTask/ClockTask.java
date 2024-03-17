package ClassTask;

import java.util.Scanner;

public class ClockTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter specific time");
        int time = input.nextInt();
        int minutes = time % 100;
        int hours = time / 100;
        System.out.println("the time is " + hours + ":" + minutes);



    }
}
