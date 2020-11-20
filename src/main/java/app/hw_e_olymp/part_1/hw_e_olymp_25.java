package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185650
public class hw_e_olymp_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        if (n>0 && m>0) System.out.println("1");
        else if (n<0 && m<0) System.out.println("1");
        else System.out.println("0");

    }
}
