package app.hw_e_olymp.general_homework;

import java.util.Scanner;
//https://www.e-olymp.com/az/submissions/7717096
public class den_boyuk_olmayan_ilk_element_____ {
    public static void main(String[] args) {
        // 1. input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = "Not Found";

        // 2. process
        for (int i = 1; i <= n; i++) {
            double num = scan.nextDouble();
            if (num <= 2.5) {
                result = String.format("%d %.2f", i, num); // "Found!"
                break;
            }
        }

        // 3. output
        System.out.println(result);
    }

    }

