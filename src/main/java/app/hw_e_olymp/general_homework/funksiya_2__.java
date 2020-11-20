package app.hw_e_olymp.general_homework;

import java.util.Scanner;

//https://www.e-olymp.com/az/contests/17734/problems/186189
public class funksiya_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            int x= scan.nextInt();
             double f=Math.sqrt(x)+(2*x)+Math.sin(x);
            System.out.println(f);

        }

    }
}
