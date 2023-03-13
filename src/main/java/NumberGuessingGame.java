import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int guessLimit = 0;
        int answer = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Choose your difficulty level (easy/hard): ");
        String level = input.nextLine();

        if (level.equalsIgnoreCase("easy")) {
            guessLimit = 10;
        } else if (level.equalsIgnoreCase("hard")) {
            guessLimit = 5;
        } else {
            System.out.println("Invalid input. Please choose either 'easy' or 'hard'.");
            System.exit(0);
        }

        int numGuesses = 0;
        int guess = 0;

        while (numGuesses < guessLimit) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            numGuesses++;

            if (guess == answer) {
                System.out.println("Congratulations! You guessed the correct number in " + numGuesses + " turns.");
                System.exit(0);
            } else if (guess < answer) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

            System.out.println("You have " + (guessLimit - numGuesses) + " guesses remaining.\n");
        }

        System.out.println("Sorry, you ran out of guesses. The number was " + answer + ".");
    }
}

