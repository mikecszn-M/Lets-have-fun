def inverse_word(word):
	inverse_word = " "
	for things in word:
		inverse_word = things + inverse_word
	
	return inverse_word

user_word = input("Enter a string like a word: ")
print(f'the reverse word is', inverse_word(user_word))