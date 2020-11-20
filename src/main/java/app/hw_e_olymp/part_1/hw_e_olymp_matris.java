package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_matris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        int [][] array= new int[n][m];

        int k=1;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                array[i][j]=k++;
            }
        }
            for (int i=0; i<n; i++){
             for (int j=0; j<m; j++){
                 System.out.print(array[i][j] + " ");

             }
                System.out.println();
         }




    }
}
