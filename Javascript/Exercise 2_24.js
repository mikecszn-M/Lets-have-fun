// 2.24  Largest and smallest of five integers
  let n1 = 4;
  let n2 = 9;
  let n3 = 2;
  let n4 = 7;
  let n5 = 5;

  let largest = n1;
  let smallest = n1;

  if (n2 > largest) largest = n2;
  if (n3 > largest) largest = n3;
  if (n4 > largest) largest = n4;
  if (n5 > largest) largest = n5;

  if (n2 < smallest) smallest = n2;
  if (n3 < smallest) smallest = n3;
  if (n4 < smallest) smallest = n4;
  if (n5 < smallest) smallest = n5;

  console.log(`Largest: ${largest}`);
  console.log(`Smallest: ${smallest}`);