  for (let firstValue = 1; firstValue <= 9; firstValue++)
    for (let b = 0; b <= 9; b++)
      for (let c = 0; c <= 9; c++) {
        const number = firstValue * 100 + b * 10 + c;
        if (firstValue * firstValue + b * b + c * c === number) console.log(number);
}
