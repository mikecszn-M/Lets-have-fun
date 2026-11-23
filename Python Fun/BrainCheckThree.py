def convert_minutes(minutes):

	seconds = minutes * 60
	hours = minutes / 60
	print(f"{minutes} min in sec is {seconds}")
	print(f"and in hour is {hours}")


minutes = int(input("Enter minutes: "))
convert_minutes(minutes)