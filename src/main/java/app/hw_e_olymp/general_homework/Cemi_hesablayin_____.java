package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Cemi_hesablayin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        double sum=0;
       for (int i=1; i<=n; i++){
           double S=(1/(n*(n+1)));
           sum=sum+ S;
       }

        System.out.printf("%.6f%n",sum);

    }
}
