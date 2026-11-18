import java.util.Scanner;

public class TaskThree{
public static void main(String... args){


Scanner input = new Scanner(System.in);

int sum = 0;
int average = 0;

for(int count=1; count<=10; count++){
System.out.println("Oga put your number inside me: ");
int numberCollected = input.nextInt();

sum += numberCollected;
}
average = sum /10;
System.out.println("The sum of the numbers is: " + sum);
System.out.println("The average is: " + average);
}
}