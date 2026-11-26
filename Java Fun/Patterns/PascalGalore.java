import java.util.Scanner;

public class PascalGalore{

    public static void printPattern() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int row = 0; row < n; row++) {

            for (int space = 1; space < n - row; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int column = 0; column <= row; column++) {
                System.out.print(number + " ");
                number = number * (row - column) / (column + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}