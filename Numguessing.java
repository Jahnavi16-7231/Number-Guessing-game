import java.util.Scanner;
import java.util.Random;

public class Numguessing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;  // Random number from 1 to 100
        int guess = 0;
        int tries = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess < number) {
                System.out.println("Too Low!");
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You guessed it in " + tries + " tries.");
            }
        }

        input.close();
    }
}
