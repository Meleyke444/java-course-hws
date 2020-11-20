package app.hw_game_tasks;

import java.util.Scanner;

public class Game1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("====================");
        int randomNumber=(int) (Math.random()*100);
         while (scan.hasNext()){
             int num= scan.nextInt();
             if (num<randomNumber) System.out.println("Your number is too small. Please, try again.");
             else if (num>randomNumber) System.out.println("Your number is too big. Please, try again.");
             else if (num==randomNumber)  {
                 System.out.println("======================");
                 System.out.println("Congratulations !!!");
                 System.out.println("======================");
                 break;
             }
         }

    }
}
