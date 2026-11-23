public class PerfectNumbersChecker{
public static int PerfectChecker(int number){

int sum = 0;

for (int factor = 1; factor < number; factor++){
	if (number % factor == 0){
	sum += factor;
}
}

if(sum == number){
return sum;
}

else{
return number;
}
}

public static void main(String... args){

System.out.printf("%d is a perfect number.", PerfectChecker(6));
}
}