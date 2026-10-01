import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       NUMBER GUESSING GAME      ");
        System.out.println("================================");

        int secretNumber = random.nextInt(100) + 1;

        System.out.println("\nI have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        int guess;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number!");
                break;
            }
        }

        scanner.close();
    }
}
