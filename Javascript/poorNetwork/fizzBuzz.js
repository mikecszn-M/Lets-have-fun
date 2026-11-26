// 1. FizzBuzz
function fizzBuzz(number) {
  if (number % 3 === 0 && number % 5 === 0) return "FizzBuzz";
  if (number % 3 === 0) return "Fizz";
  if (number % 5 === 0) return "Buzz";
  return String(number);
}
console.log(fizzBuzz(15));
console.log(fizzBuzz(5));
console.log(fizzBuzz(1));

console.log(" ");

// 2. Power of two
function isPowerOfTwo(number) {
if (number < 1) return false;
while (number % 2 === 0) {
number = number / 2;
}
return number === 1;
}
console.log(isPowerOfTwo(1));
console.log(isPowerOfTwo(16));
console.log(isPowerOfTwo(17));
console.log(isPowerOfTwo(0));

console.log(" ");

// 3. Climb stairs 
function climbStairs(totalSteps) {
let previous = 1;
let current = 1;
for (let step = 2; step <= totalSteps; step++) {
const next = previous + current;
previous = current;
current = next;
}
return current;
}
console.log(climbStairs(5));

console.log(" ");

//4.SquareRoot
function findSquareRoot(number) {
if (number < 0) {
return "Invalid";
}

let guess = 0;
while ((guess + 1) * (guess + 1) <= number) {
guess = guess + 1;
}

return guess;
}

console.log(findSquareRoot(38));
console.log(findSquareRoot(-22));
console.log(findSquareRoot(144));

console.log(" ");

// 5. hammingWeight
function hammingWeight(number) {
  let count = 0;

while (number > 0) {
let rem = number % 2;
count += rem;
number = (number - rem) / 2;
  }

  return count;
}

console.log(hammingWeight(1001));


console.log(" ");

// 6. Reverse integer
function reverseInteger(number) {
let negativeNum = false;
if (number < 0) {
negativeNum = true;
number = number * -1;
}

let reversed = 0;

while (number > 0) {
let lastDigit = number % 10;

reversed = reversed * 10 + lastDigit;

number = (number - lastDigit) / 10;
}

if (negativeNum === true) {
return reversed * -1;
}

return reversed;
}

console.log(reverseInteger(123));
console.log(reverseInteger(-456));


console.log(" ");

// 7. palindromeNumber
function isPalindromeNumber(number) {
if (number < 0) {
return false;
}

let originalNumber = number;
let reversed = 0;

while (number > 0) {
let lastDigit = number % 10;

reversed = reversed * 10 + lastDigit;

number = (number - lastDigit) / 10;
}

if (reversed === originalNumber) {
return true;
} 
else {
return false;
}
}

console.log(isPalindromeNumber(121));
console.log(isPalindromeNumber(123));
console.log(isPalindromeNumber(-121));

console.log(" ");

// 8. countPrime
function countPrimes(upperLimit) {
let primeCount = 0;

let number = 2;

while (number < upperLimit) {
let isPrime = true;
let divisor = 2;

while (divisor < number) {
if (number % divisor === 0) {
isPrime = false;
}
divisor = divisor + 1;
}


if (isPrime === true) {
primeCount += 1;
}

number += 1;
}

return primeCount;
}

console.log(countPrimes(10));

console.log(" ");

// 9. perfectNumber
function checkPerfectNumber(number) {
if (number <= 1) return false;
let sum = 0;
for (let divisor = 1; divisor < number; divisor++) {
if (number % divisor === 0) sum += divisor;
}
return sum === number;
}
console.log(checkPerfectNumber(28));
