def vowel_looker(word):
	vowels = "aeiou"
	found = ""
	count = 0
	for things in word:
		if things in vowels and things not in found:
			found = found + things
			if "A" <= things <= "Z" or "a" <= things <= "z":			
				count += 1
	return count

word = input("Oga put a word: ")
print(f'The number of unduplicated vowel in this word is:',vowel_looker(word))