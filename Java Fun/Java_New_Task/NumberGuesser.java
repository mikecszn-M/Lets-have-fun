import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int secret = 42;
        int attempts = 0;
        int guess = 0;

        while (guess != secret) {
            System.out.println("Guess a number between 1 and 100:");
            guess = prompt.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low");
            } else if (guess > secret) {
                System.out.println("Too high");
            }
        }

        System.out.println("Correct! It took you " + attempts + " attempts.");
    }
}
