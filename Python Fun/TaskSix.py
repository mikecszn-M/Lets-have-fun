sum = 0
counter = 0
for number in range(1, 11):
	user = int(input("Enter a score please: "))

	if user % 2 == 0:
		sum+= user
		counter+=1

average = sum /counter
print("The average is:", average)