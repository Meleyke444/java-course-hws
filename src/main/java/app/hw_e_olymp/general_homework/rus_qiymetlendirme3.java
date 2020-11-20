package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class rus_qiymetlendirme3__ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        double y=  (((Math.pow(x,2) + (3*x)-4)/ ((2*x)-3)) - ((x+2)/(Math.pow(x,2)-(5*x)+7)));
        System.out.println(y);

    }
}
