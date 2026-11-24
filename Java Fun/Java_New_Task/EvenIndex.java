public class EvenIndex {
    public static void main(String[] args) {
        String sample = "JavaScript";
        String result = "";

        for (int index = 1; index < sample.length(); index += 2) {
            result += sample.charAt(index);
        }

        System.out.println(result);
    }
}
