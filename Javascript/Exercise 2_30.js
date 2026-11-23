// 2.30  Separate the digits of a five-digit number
  let number = 34980;

  let digit5 = number % 10;
  number = (number - digit5) / 10;
  let digit4 = number % 10;
  number = (number - digit4) / 10;
  let digit3 = number % 10;
  number = (number - digit3) / 10;
  let digit2 = number % 10;
  let digit1 = (number - digit2) / 10;

  console.log(`${digit1}   ${digit2}   ${digit3}   ${digit4}   ${digit5}`)