public class PerfectNumbersChecker {
    public static String perfectChecker(int number) {

        int sum = 0;

        for (int factor = 1; factor < number; factor++) {
            if (number % factor == 0) {
                sum += factor;
            }
        }

        if (sum == number) {
            return number + " is a perfect number.";
        } else {
            return number + " is not a perfect number.";
        }
    }

    public static void main(String... args) {
        System.out.println(perfectChecker(6));
        System.out.println(perfectChecker(12));
    }
}