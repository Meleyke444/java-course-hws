package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int d= scan.nextInt();
        int maks1= Math.max(a,b);
        int maks2=Math.max(c,d);
        int maks=Math.max(maks1,maks2);
        System.out.println(maks);
    }
}
