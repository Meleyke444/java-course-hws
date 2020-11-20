package app.hw_e_olymp.general_homework;

import java.util.Scanner;

public class Hasilin_ceme_nisbeti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();


        long sumOfDigits = findSumOfDigits(n);
        long SubsOfDigits=findSubsOfDigits(n);
        double divide=SubsOfDigits/sumOfDigits;
        System.out.printf("%.3f %n",divide);
    }

    private static int findSubsOfDigits(long n) {
        int subs=1;
        while (n > 0) {
            subs *= n % 10;
            n /= 10;
        }
        return subs;
    }

    private static int findSumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
