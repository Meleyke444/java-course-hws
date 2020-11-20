package app.hw_e_olymp;

import java.util.Scanner;

//abcd
//https://www.e-olymp.com/az/contests/17698/problems/185649
public class hw_e_olymp_26___ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if (n>999 && n<10000) {
            int d = n%10;
            int c = (n/10)%10;
            int b = (n/100)%10;
            int a = n/1000;
            if (a>0 && b>0 && c>0 && d>0){
            if (n % a == 0 && n % b == 0 && n % c == 0 && n % d == 0) System.out.println("YES");
        else System.out.println("NO");

        }}


        }
    }

