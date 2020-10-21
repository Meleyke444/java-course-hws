package app.lesson06;

import java.util.Scanner;

public class hackerrank_3 {
    public static void main(String[] args) {
       // https://www.hackerrank.com/challenges/java-loops/problem
        Scanner scan= new Scanner(System.in);
        int q= scan.nextInt();
   int S0 = 0, S1 = 0, Sn_1 = 0;
        for (int i=0; i<q; i++){
             int a= scan.nextInt();
            int  b= scan.nextInt();
           int n= scan.nextInt();
            scan.close();

            for (n=1; n<=15; n++){
                S0= (int) (a+ Math.pow(2,0)*b);
                S1= (int) (a+ (Math.pow(2,0)*b) + (Math.pow(2,1)*b));
                Sn_1= (int) (a+ Math.pow(2,0)*b + Math.pow(2,1)*b + Math.pow(2, n-1)*b);
                System.out.print(S0 + " " + S1+ " "+ Sn_1 );
            }



        }






    }

}
