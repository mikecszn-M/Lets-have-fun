public class VowelConsonantCounter {
    public static void main(String[] args) {
        String word = "Wordings".toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
