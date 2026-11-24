let word = "racecar";
let reversed = "";

for (let letter of word) {
  reversed = letter + reversed;
}
if (word == reversed){
console.log("Palindrome jhor");
}
else console.log("no Palindrome");