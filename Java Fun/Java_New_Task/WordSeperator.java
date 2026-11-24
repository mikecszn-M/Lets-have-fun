import java.util.Scanner;

public class WordSeperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);

            if (letter == ' ') {
                System.out.println(word);
                word = "";
            } else {
                word = word + letter;
            }
        }

        System.out.println(word);
    }
}
