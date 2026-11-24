import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;

        System.out.println("Enter numbers to average (enter -1 to stop):");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            sum += input;
            count++;
            System.out.println("Average so far: " + (double) sum / count);
        }
    }
}
