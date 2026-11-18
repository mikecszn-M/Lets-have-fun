sum = 0
for number in range(1, 11):
	user = int(input("Enter a score please: "))
	if number % 2 == 0:
		sum+= user
		print("The sum is:", sum)