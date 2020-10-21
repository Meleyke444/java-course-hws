
package app.lesson06;

import java.util.Scanner;

public class hackerrank_2 {
    public static void main(String[] args) {
        ////https://www.hackerrank.com/challenges/java-loops-i/problem
        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();
        if (N>=2 && N<=20){
            for (int i=1; i<=10; i++){
                int result = N*i;
                System.out.println(N +" x " + i+ " = " + result);
            }
        }

        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        scan.close();
    }
}
