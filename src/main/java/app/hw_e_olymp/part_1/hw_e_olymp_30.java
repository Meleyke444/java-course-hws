package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_30 {
    //https://www.e-olymp.com/az/contests/17698/problems/185644
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a= scan.nextInt();
        int b= scan.nextInt();
        if (n%a==0 && n%b==0) System.out.println("YES");
        else System.out.println("NO");

    }
}
