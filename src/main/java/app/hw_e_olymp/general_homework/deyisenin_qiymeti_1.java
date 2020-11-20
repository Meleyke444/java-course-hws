package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class deyisenin_qiymeti_1__ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x= scan.nextDouble();
        double y= (Math.pow(x,3) - ((5*(Math.pow(x,2)))/7))+  ((9*x)- (3/x) +1);
        System.out.println(y);
    }
}
