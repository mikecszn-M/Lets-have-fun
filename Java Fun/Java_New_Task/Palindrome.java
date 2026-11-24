import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 7-letter word: ");
        String word = input.next();
	
	if (word.length() != 7) {
            System.out.println("Please enter exactly 7 letters.");
}
        if (word.charAt(0) == word.charAt(6) &&
            word.charAt(1) == word.charAt(5) &&
            word.charAt(2) == word.charAt(4)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}