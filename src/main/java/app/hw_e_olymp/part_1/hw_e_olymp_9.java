package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_9 {
    //https://www.e-olymp.com/az/contests/17698/problems/185630
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number= scan.nextInt();
        int a=number/100;
        int b=(number/10)%10;
        int c=number%10;
        if (a==c) System.out.println("=");
        else {
            int maks = Math.max(a, c);
            System.out.println(maks);
        }
    }
}
