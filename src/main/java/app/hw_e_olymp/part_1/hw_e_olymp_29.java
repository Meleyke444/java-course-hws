package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185645
public class hw_e_olymp_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        if (x>0) System.out.println("1");
        else if (x==0) System.out.println("0");
        else if (x<0) System.out.println("-1");
    }
}
