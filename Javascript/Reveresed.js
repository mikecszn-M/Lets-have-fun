let sample = "hello";
let reversed = "";

for (let letter of sample) {
  reversed = letter + reversed;
}

console.log(reversed);