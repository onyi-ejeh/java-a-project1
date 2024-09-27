package ng.onyi.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //Get Players Name
        System.out.println("Enter Name Of Player 1");
        String player1 = scanner.nextLine();
        System.out.println("Enter Name Of Player 2");
        String player2 = scanner.nextLine();


        // Initialise Score
        int score1 = 0;
        int score2 = 0;

        // Each Player Rolls Five (5) times

        System.out.println("\nThe Dice game starts now!...\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println(player1 + " press enter to roll dice....");
            scanner.nextLine();

            // Player 1 rolls the dice
            int roll = random.nextInt(6) + 1; // Dice rolls between 1 and 6
            System.out.println(player1 + " rolled " + roll);
            score1 += roll;

            System.out.println(" ");
            System.out.println(player2 + " press enter to roll dice....");
            scanner.nextLine();
            System.out.println(" ");

            //player2 rolls the dice
            int roll2 = random.nextInt(6) + 1;
            System.out.println(player2 + " rolled " + roll2);
            score2 += roll2;

            System.out.println();
        }

        scanner.close();

        //Printing Final Score
        System.out.println(player1 + " Total Score: " + score1);
        System.out.println(player2 + " Total Score: " + score2);

        //check the level of player1
        checkLevel(player1, score1);

        //Check the level of player2
        checkLevel(player2, score2);

        // To Determine the winner
        if (score1 > score2) {
            System.out.println(player1 + " wins! ");

        } else if (score2 > score1) {
            System.out.println(player2 + " wins! ");

        } else {
            System.out.println(" It's a tie! ");
        }

    }

    public static void checkLevel(String player, int score) {
        if (score >= 25) {
            System.out.println(player + " well passed");
        } else if (score >= 15) {
            System.out.println(player + " just passed");
        } else {
            System.out.println(player + " did not pass");
        }
    }

}

