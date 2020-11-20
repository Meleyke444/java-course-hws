package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185658
public class hw_e_olymp_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n=scan.nextDouble();
        if ((n%2!=0) || (n>0 && n>99 && n<1000)) System.out.println("YES");
else System.out.println("NO");
    }
}
