package app.hw_e_olymp;

import java.util.Scanner;

public class hw_e_olymp_duzbucaqli1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt(); //n*3  => 2x3
        for (int i=0 ; i<n ; i++){
            for (int j=0; j<3; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
