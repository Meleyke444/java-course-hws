package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_funksiya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x= scan.nextDouble();
        double y= scan.nextDouble();
        double z= scan.nextDouble();
        double maks1= Math.max(x,y);
        double maks2=Math.max(y,z);
         double cem= x+y+z;
         double min1= Math.min(maks1,maks2);
         double min= Math.min(min1,cem);
        System.out.println(min);


    }
}
