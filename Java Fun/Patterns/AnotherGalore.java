import java.util.Scanner;

public class AnotherGalore {

public static void printPattern() { 
int n = 7;
	for (int row = 1; row <= n; row++) {
		int biggest = n - row + 1;

		for (int column = 1; column < row; column++) {
			System.out.print(" ");
}
		for (int column = biggest; column >= 1; column--) {
                	System.out.print(column);
}

		for (int column = 2; column <= biggest; column++) {
                	System.out.print(column);
}

		System.out.println();
}
}

    public static void main(String[] args) {
        printPattern();
}
}