package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_cemin_kvadrati {
    //https://www.e-olymp.com/az/contests/17719/problems/185930
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a= n%10;
        int b=n/10;
        int cem=a+b;
        int kvadrat= (int) Math.pow(cem,2);
        System.out.println(kvadrat);

    }
}
