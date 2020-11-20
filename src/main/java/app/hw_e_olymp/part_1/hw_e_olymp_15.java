package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185660
public class hw_e_olymp_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

            if (n % 2 == 0 && n > 0) System.out.println("NO");
            else if (n % 2 !=0 && n < 0) System.out.println("NO");
            else System.out.println("YES");
    }

    }

