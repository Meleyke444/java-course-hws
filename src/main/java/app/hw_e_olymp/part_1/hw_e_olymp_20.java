package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_20 {
    //https://www.e-olymp.com/az/contests/17698/problems/185655
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if (n%2==0){
            System.out.println(n+1);
        } else  System.out.println(n+2);

    }
}
