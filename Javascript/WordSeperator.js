const prompt = require("prompt-sync")();
let text = prompt("Enter a sentence:");
let word = "";

for (let letter of text) {
  if (letter == " ") {
    console.log(word);
    word = "";
  } else {
    word += letter;
  }
}

console.log(word);