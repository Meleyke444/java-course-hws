package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Ededlerin_kvadrati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for (int i=1; i<=n; i++){
            if (Math.sqrt(Math.pow(i,2))==i) {
                System.out.print(i+ " ");
            }
           else continue;
        }
    }
}
