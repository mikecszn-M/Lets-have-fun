public class Reverse{
    public static void main(String[] args) {
        String sample = "hello";
        String reversed = "";

        for (int i = 0; i < sample.length(); i++) {
            reversed = sample.charAt(i) + reversed;
        }

        System.out.println(reversed);
    }
}
