package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185642
public class hw_e_olymp_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        if (a%b==0) System.out.println("Divisible");
        else {
            int tam, qaliq;
            tam= a/b;
            qaliq=a%b;
            System.out.println( tam+ " " + qaliq);
        }

    }
}
