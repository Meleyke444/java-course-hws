package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185651
public class hw_e_olymp_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if (n<0) n=-n;
        if (n<10 && n>-10 ) System.out.println("Ok");
        else System.out.println("No");
    }
}
