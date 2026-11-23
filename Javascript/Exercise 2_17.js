// 2.17  Sum, average, product, smallest, largest of three integers
  let a = 9;
  let b = 7;
  let c = 8;

  let sum = a + b + c;
  let smallest = a;
    if (b < smallest) smallest = b;
    if (c < smallest) smallest = c;
let largest = a;
    if (b > (largest)) largest = b;
    if (c > largest) largest = c;
console.log(`Smallest: ${smallest}`);
  console.log(`Sum: ${sum}`);
  console.log(`Average: ${(sum - sum % 3) / 3}`);
  console.log(`Product: ${a * b * c}`);
  console.log(`Smallest: ${smallest}`);
  console.log(`Largest: ${largest}`);