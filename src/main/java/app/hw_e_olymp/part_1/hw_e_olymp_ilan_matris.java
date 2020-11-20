package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_ilan_matris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int [][] array= new int[n][n];
        int count=1;
        for (int i=0; i<n;i++ ){
            if (i%2==0){
                for (int j=0; j<n; j++){
                    array[i][j]=count++;
                }
            } else {
                for (int j=n-1; j>=0; j--){
                    array[i][j]=count++;
                }
            }

            }









        for (int i=0; i<n;i++ ){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
