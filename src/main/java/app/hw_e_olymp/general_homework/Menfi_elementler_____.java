package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Menfi_elementler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short h= scan.nextShort();
        double array[]=new double[h];
        double sum=0;
        int count=0;
        for (int i=1; i<=h; i++){
            double x= scan.nextDouble();
            if (x<0) {
                array[i]=x;
                sum=sum+array[i];
                count=count+1;
            }
        }


        System.out.printf(" %d %.2f %n",count, sum);
    }
}
