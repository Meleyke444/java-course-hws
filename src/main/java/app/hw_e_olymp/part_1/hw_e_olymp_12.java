package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_12 {
    //https://www.e-olymp.com/az/contests/17698/problems/185633
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        int a=number/1000;
        int b=number%10;
        int hasil=a+b;
        System.out.println(hasil);


    }
}
