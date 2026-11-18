import java.util.Scanner;

public class TaskSeven{
public static void main(String... args){


Scanner input = new Scanner(System.in);

int sum = 0;
float average = 0;
int counter = 0;

for(int count=1; count<=10; count++){
System.out.println("Oga put your number inside me: ");
int numberCollected = input.nextInt();

if(numberCollected % 2 == 0){
counter++;
sum += numberCollected;
}
}
average = sum / counter;
System.out.println("The sum is: " + sum);
System.out.println("The average is: " + average);
}
}