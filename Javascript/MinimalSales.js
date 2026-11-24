let sales = 0;
let income = 5000;

while (income < 30000) {
  sales++;
  if (sales <= 5000) {
    income = 5000 + sales * 6 / 100;
  } else if (sales <= 10000) {
    income = 5000 + 300 + (sales - 5000) * 8 / 100;
  } else {
    income = 5000 + 700 + (sales - 10000) / 10;
  }
}

console.log("Minimum sales: $" + sales);