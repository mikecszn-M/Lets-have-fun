public class MinimalSales {
    public static void main(String[] args) {
        int sales = 0;
        double income = 5000;

        while (income < 30000) {
            sales++;
            if (sales <= 5000) {
                income = 5000 + sales * 6.0 / 100;
            } else if (sales <= 10000) {
                income = 5000 + 300 + (sales - 5000) * 8.0 / 100;
            } else {
                income = 5000 + 700 + (sales - 10000) / 10.0;
            }
        }

        System.out.println("Minimum sales: $" + sales);
    }
}
