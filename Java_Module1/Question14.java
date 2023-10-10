import java.util.Random;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1; 
        int maxRange = 100; 
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("Try to guess it!");
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = input.nextInt();
            numberOfAttempts++;
            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Your guess is out of the valid range.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly!");
                System.out.println("Number of attempts: " + numberOfAttempts);
            }
        }
        input.close();
    }
}