const prompt = require("prompt-sync")();

let number = Number(prompt("Oga enter a two digit number: "));

while (number > -10 && number < 10) {
	console.log("That is a single digit... Please try again");
	number = Number(prompt("Please put a number with at least two digits: "));
	}

let sum = 0;

	if (number < 0) {
	number *= -1;

	while (number >= 10) {
	sum = sum + number % 10;
	number = (number - number % 10) / 10;
	}

	sum = sum - number;
	} 
	else {
	while (number > 0) {
	sum = sum + number % 10;
	number = (number - number % 10) / 10;
	}
}

console.log("Sum of the digits is: " + sum);