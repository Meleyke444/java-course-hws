package app.hw_e_olymp;
//https://www.e-olymp.com/az/contests/17698/problems/185639
import java.util.Scanner;

public class hw_e_olymp_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if (n>0)          System.out.println("Positive");
        else if (n==0)    System.out.println("Zero");
        else  if (n<0 )   System.out.println("Negative");
    }
}
