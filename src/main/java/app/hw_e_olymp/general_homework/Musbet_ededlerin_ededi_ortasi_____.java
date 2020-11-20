package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Musbet_ededlerin_ededi_ortasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextShort();
        int array[]=new int[n];
        int sum = 0;
        for (int i = 0; i<n; i++) {
            short x = scan.nextShort();
            array[i] = x;
            sum = sum + array[i];
        }
                double ededi_orta=sum/n;
        if (ededi_orta<0) System.out.println("Not Found");
              else   System.out.printf(" %.2f %n",ededi_orta);
            }
        }




