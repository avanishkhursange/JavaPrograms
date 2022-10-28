// Java program for Number Guessing Game

import java.util.Scanner;

public class rough {

    // Function that implements the number guessing game

    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        // Generate random numbers
        int number = 1 + (int) (100 * Math.random());

        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 100.");
        System.out.println("Enter the number of trials: ");
        int K = sc.nextInt();

        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");

            // Take input for guessing

            guess = sc.nextInt();

            // If the number is guessed

            if (number == guess) {
                System.out.println("Congratulations!\nYou guessed the number.");
                break;
            }

            else if (number > guess && i != K - 1) {
                System.out.println( "The number is greater than " + guess);
            }

            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }

        }
        sc.close();
        if (i == K) {

            System.out.println("You have exhausted "+K+ " trials.");
            System.out.println("The number was " + number);

        }
        
    }

    // Driver Code
    public static void main(String arg[])
    {
        guessingNumberGame();
    }

}
