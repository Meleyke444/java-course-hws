package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_27 {
    //https://www.e-olymp.com/az/contests/17698/problems/185648
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int a= scan.nextInt();
        int b= scan.nextInt();
        if (x>=a && x<=b) System.out.println("YES");
        else System.out.println("NO");


    }
}
