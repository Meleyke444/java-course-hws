package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185640
public class hw_e_olymp_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int y;
        if (x<5) {
            y= (int) (Math.pow(x,2)- (3*x)+4);
            System.out.println(y);
        } else if (x>=5) {
            y = x+7;
            System.out.println(y);
        }
    }
}
