import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generates a number between 1 and 100

        Scanner scanner = new Scanner(System.in);

        int userGuess = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println();
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println();

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) 
            {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
            }
        }

        scanner.close();
    }
}