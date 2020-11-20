package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Cevrilme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int count=0;
        int i=1;
        while ( i<n){
            if (n%2==0) n=n/2;
            else if (n%2==1) n=n+1;
            if (n==1) break;
        }
        System.out.println(count);

    }
}
