import java.util.Scanner;

public class TaskTen{
public static void main(String... args){


Scanner input = new Scanner(System.in);

int sum = 0;
int counter = 0;

for(int count=1; count<=10; count++){
System.out.println("Oga put your number inside me: ");
int numberCollected = input.nextInt();

if(numberCollected > 0 && numberCollected < 100){
sum += numberCollected;
counter++;
}
}
double average = sum / counter;
System.out.println("The sum of the numbers is: " + sum);
System.out.println("The average of the numbers is: " + average);
}
}