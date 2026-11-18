sum = 0

for number in range(1, 11):
	userScore = int(input("Enter a score please: "))


	while (userScore < 0 or userScore > 100):
		print("Inavlid Input O")

		userScore = int(input("Enter a score please: "))

	sum+=userScore
print("The sum is:", sum)