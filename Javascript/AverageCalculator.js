  const inputs = [10, 20, 30, 40, -1];
  let sum = 0, count = 0;
  for (const input of inputs) {
    if (input === -1) break;
    sum += input;
    count++;
    console.log(`Average so far: ${sum / count}`);
  }
