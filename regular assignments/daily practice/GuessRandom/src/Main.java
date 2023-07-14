import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("Try to guess number :");

        while (true) {
            System.out.print("Enter your guess (or -1 to quit): ");
            int guess = scanner.nextInt();

            if (guess == -1) {
                System.out.println("Quitting the game...");
                break;
            }

            attempts++;

            if (guess < randomNumber) {
                System.out.println("Your guess is low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is high.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                break;
            }
        }
    }
}
