import java.util.Scanner;

public class PhaseTwoTaskOne{
public static void main (String... args){

Scanner input = new Scanner(System.in);

int sum = 0;
int counter = 0;

for(int count=1; count<=10; count++){
System.out.println("Oga put your number inside me: ");
int numberCollected = input.nextInt();

if(numberCollected == 1){
System.out.println("No, it is not a prime number");
}

boolean isPrime = numberCollected > 1;

for(int divisor = 2; divisor * divisor <= numberCollected; divisor++){
if(numberCollected % divisor == 0){
isPrime = false;
System.out.println("No, it is not a prime number");
break;
}
}

if(isPrime){
System.out.println("Yep, it is a prime number");
}
}
}
}