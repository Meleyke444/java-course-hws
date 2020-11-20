package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185658
public class hw_e_olymp_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2==0 && n<0 && n%3==0) System.out.println("NO");
        if (n%2==0) {
            System.out.println("YES");
        }   else if ( n<0 && n%3==0)System.out.println("YES");
        else System.out.println("NO");



    }
}