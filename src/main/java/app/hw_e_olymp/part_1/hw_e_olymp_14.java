package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185635
public class hw_e_olymp_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        int maks=Math.max(a,b);
        int min=Math.min(a,b);
        System.out.println(min+ " "+ maks);
    }
}
