package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class rus_qiymetlendirme2__ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x= scan.nextDouble();
        double y=  (x- ((Math.pow(x,2)+4)/2) + (Math.pow(x,3))-( 3/ (x+7)));
        System.out.println(y);


    }
}
