package number_guessing_game;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game");
        boolean playAgain = true;

        while (playAgain) {
            int min, max;
            while (true) {
                System.out.print("Enter Minimum Number: ");
                min = sc.nextInt();
                System.out.print("Enter Maximum Number: ");
                max = sc.nextInt();
                if (max > min) {
                    break;
                } else {
                    System.out.println("Maximum number must be greater than minimum number. Please try again.");
                }
            }

            int attempts = 10;
            int range = max - min + 1;
            int ans = (int) (Math.random() * range) + min;

            System.out.println("\nI have chosen a number between " + min + " and " + max + ". Can you guess it?");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Guess the number: ");
                int guess = sc.nextInt();

                if (guess == ans) {
                    System.out.println("Congratulations! You guessed it right.");
                    break;
                } else if (guess > ans) {
                    System.out.println("Your guess is greater than the number.");
                } else {
                    System.out.println("Your guess is smaller than the number.");
                }

                attempts--;

                if (attempts == 0) {
                    System.out.println("\nYou have reached the maximum attempts limit.");
                    System.out.println("The correct number was: " + ans);
                }
            }

            System.out.println("\n1. Play Again");
            System.out.println("2. Exit");
            while (true) {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    break;
                } else if (choice == 2) {
                    System.out.println("Thank you for playing! Goodbye!");
                    playAgain = false;
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        }

        sc.close();
    }
}
