package app.hw_e_olymp.general_homework;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17734/problems/186198
public class rus_x_ve_y_qiymet2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        double y=((2*x)/Math.sqrt(Math.pow(x,2)+1))-((Math.sqrt(Math.pow(x,2)+1))/Math.pow(x,3));
        System.out.println(y);
    }
}
