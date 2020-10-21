package app.lesson07;

import java.util.Scanner;

public class hw_5_factorial {
    // User enters a number. Find factorial of this number (multiplication of all numbers from 1 to number)
    // ex. input = 5 => factorial = 1 x 2 x 3 x 4 x 5 = 120
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int number = scan.nextInt();
        int factorial = 1;

        for (int i=1; i<=number; i++ ){
            factorial =(factorial*i);
        }
        System.out.println(factorial);
    }
}
