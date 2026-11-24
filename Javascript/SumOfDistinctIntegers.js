  const target = 18;
  for (let i = 1; i <= 7; i++) {
    for (let j = i + 1; j <= 8; j++) {
      const k = target - i - j;
      if (k > j && k <= 9) {
        console.log(`${i} + ${j} + ${k} = ${target}`);
      }
    }
  }
