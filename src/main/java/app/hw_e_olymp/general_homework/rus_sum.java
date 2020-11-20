package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class rus_sum______________ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        long sum=0;
        for (int i=1; i<=n; i++){
            sum+=(long) Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
