package app.hw_e_olymp;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17698/problems/185643
public class hw_e_olymp_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
         int y;
        if (x<-4) {
            y=x+5;
            System.out.println(y);
        } else if (x>=-4 && x<=7) {
            y = (int) (Math.pow(x,2)-(3*x));
            System.out.println(y);
        } else if (x>7){
            y= (int) (Math.pow(x,3)+(2*x));
            System.out.println(y);
        }
    }}
