package app.lesson07;

import java.util.Scanner;

public class arrayapp {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       String []  ad = new String [3];
       int [] yash= new int[3];
       for (int i=0;  i<3; i++){
           String name =scan.nextLine();
           int age= scan.nextInt();
           scan = new Scanner(System.in);
           ad[i]=name;
           yash[i]=age;

       }
        for (int k=0; k<3; k++){
            System.out.printf(" %s = %d %n", ad[k] , yash[k]);
        }









    }
}
