import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("================================");
            System.out.println("      NUMBER GUESSING GAME");
            System.out.println("================================");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println(" Congratulations!");
                    System.out.println("You guessed the correct number.");
                    System.out.println("Attempts Used: " + attempts);
                    break;
                } else if (guess < number) {
                    System.out.println(" Too Low!");
                } else {
                    System.out.println(" Too High!");
                }

                System.out.println("Attempts Left: " + (maxAttempts - attempts));
            }

            if (attempts == maxAttempts) {
                System.out.println("--------------------------------");
                System.out.println(" Game Over!");
                System.out.println("Correct Number was: " + number);
            }

            System.out.print("Play Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thank You for Playing!");
        sc.close();
    }
}
