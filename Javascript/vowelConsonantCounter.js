const word = "Wordings";
const vowels = "aeiouAEIOU";
let vowelCount = 0;
let consonantCount = 0;

for (const things of word) {
  if ((things >= "A" && things <= "Z") || (things >= "a" && things <= "z")) {
    if (vowels.includes(things)) {
      vowelCount++;
    } else {
      consonantCount++;
    }
  }
}

console.log(`Vowels: ${vowelCount}, Consonants: ${consonantCount}`);
