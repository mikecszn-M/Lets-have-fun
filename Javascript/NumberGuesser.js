const prompt = require("prompt-sync")();
let secret = 42;
let attempts = 0;
let guess = 0;

while (guess != secret) {
  guess = Number(prompt("Guess a number between 1 and 100:"));
  attempts++;

  if (guess < secret) {
    console.log("Too low");
  } else if (guess > secret) {
    console.log("Too high");
  }
}

console.log("Correct! It took you " + attempts + " attempts.");