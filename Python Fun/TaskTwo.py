sum = 0
average = 0
for number in range(0, 10):
	user = int(input("Enter a score please: "))
	sum+= user
average = sum / 10
print("The average is:", average)