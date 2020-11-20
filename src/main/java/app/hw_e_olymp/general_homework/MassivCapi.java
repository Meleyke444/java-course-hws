package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Massiv_capi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int array[]=new int[n];
        for (int i=0; i<n; i++){
            int x= scan.nextInt();
            array[i]=x;
        }

        for (int j=0; j<n; j++){

            System.out.println(array[j]);
        }





    }
}
