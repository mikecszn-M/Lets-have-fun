def string_length(word):
	count = 0
	for letter in word:
		if "A" <= letter <= "Z" or "a" <= letter <= "z":
			count += 1
	return count

	
user_word = input("Enter a string like a word: ")
print(f'The length of the word is:', string_length(user_word))