package ClassTask;

public class ComparisonTask {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 10;
        boolean result;
         result = number2 > number1;
        System.out.println(result);

        int number3 = 25;
        int number4 = 5;
         result = number3 >= number4;
        System.out.println(result);

        int number5 = 20;
        int number6 = 10;
        result = number5 < number6;
        System.out.println(result);

        int number7 = 35;
        int number8 = 50;
         result = number7 <= number8;
        System.out.println(result);


        int number9 = 25;
        int number10 = 25;
        result = number9 == number10;
        System.out.println(result);

        int number11 = 50;
        int number12 = 50;
        result = number11 != number12;
        System.out.println(result);


        String number13 = "City";
        String number14 = "City";
         result = number13 == number14;
        System.out.println(result);

        String number15 = "CITY";
        String number16 = "city";
        result = number15.equalsIgnoreCase(number16);
        System.out.println(result);



    }
}
