package app.hw_e_olymp.general_homework;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17734/problems/186199
public class rus_x_ve_y_qiymetlendirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        double y=  ((Math.sqrt(Math.pow(x,4)+1)/Math.pow(x,2))-(Math.sqrt(Math.pow(x,2)/(Math.pow(x,2)+1))));
        System.out.println(y);
    }
}
