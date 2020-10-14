package app.lesson04;

import java.util.Scanner;

public class CalculationApp {
    public static void main(String[] args) {
        double result = 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1= scan.nextDouble();
        System.out.println(" Enter operator ( + ; - ; * ; / ; % )");
        char operator =scan.next().charAt(0);
        System.out.println(" Enter the second number: ");
        double number2 = scan.nextDouble();

        switch (operator) {
            case '+' :
                result= number1+number2;
                break;
            case '-' :
                result= number1- number2;
                break;
            case '*':
                result= number1*number2;
                break;
            case '/' :
                result=number1/number2;
                break;
            case '%':
                result= number1%number2;
                break;
            default:
                System.out.println("=================================================");
                System.out.println("<<<<you have entered an incorrect operator!>>>>>>");

        }
        System.out.println("=================================================");
        System.out.println("result: " + result);
        System.out.println("=================================================");
    }
}
