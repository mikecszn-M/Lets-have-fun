public class SumOfDistinctIntegers {
    public static void main(String[] args) {
        int target = 18;
        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 8; j++) {
                int k = target - i - j;
                if (k > j && k <= 9) {
                    System.out.println(i + " + " + j + " + " + k + " = " + target);
                }
            }
        }
    }
}
