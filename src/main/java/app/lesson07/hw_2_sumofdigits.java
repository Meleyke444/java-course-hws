package app.lesson07;

import java.util.Scanner;

public class hw_2_sumofdigits {
    //User enters a number. Write a method to find sum of all digits of this number (inclusive).
    //ex. input = 12345 ==> sum = 1+2+3+4+5 = 15
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int result = sum_of_digits(number);
        System.out.println(result);
    }

    //123 => 1+2+3
    private static int sum_of_digits(int number) {

        int sum = 0;
        for (int i = 0; i <=number; i++) {
           int remain = number % 10;
            sum += remain;
            number/=10;
        }
        return sum;



    }

}