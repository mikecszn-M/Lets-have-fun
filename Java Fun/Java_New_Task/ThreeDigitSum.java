public class ThreeDigitSum {
    public static void main(String[] args) {
        for (int firstValue = 1; firstValue <= 9; firstValue++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 9; c++) {
                    int number = firstValue * 100 + b * 10 + c;
                    if (firstValue * firstValue + b * b + c * c == number) System.out.println(number);
                }
    }
}
