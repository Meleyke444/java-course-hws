package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_duzbucaqli2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();

        for (int i=0 ; i<n ; i++){
            for (int j=0; j<m; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
