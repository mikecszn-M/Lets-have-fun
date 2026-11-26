const prompt = require("prompt-sync")();

const input = prompt("Please Oga put a positive integer");
const numCollected = Number(input);

if (numCollected < 0) {

console.log("This is not a positive integer");
}
else{
let factorialNeeded = 1;

for (let number = 1; number<=numCollected; number++){
factorialNeeded *= number;
}
console.log("Factorial of the number inputted is: " + factorialNeeded);
}


