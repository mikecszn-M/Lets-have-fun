// 2.26  Is (first * 3) a multiple of (second * 2)?
  let first = 2;
  let second = 5;

  if ((first * 3) % (second * 2) == 0) {
    console.log(`${first * 3} is a multiple of ${second * 2}`);
  } else {
    console.log(`${first * 3} is not a multiple of ${second * 2}`);
  }