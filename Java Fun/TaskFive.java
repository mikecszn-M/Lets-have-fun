import java.util.Scanner;

public class TaskFive{
public static void main(String... args){


Scanner input = new Scanner(System.in);

int sum = 0;

for(int count=1; count<=10; count++){
System.out.println("Oga put your number inside me: ");
int numberCollected = input.nextInt();

if(numberCollected % 2 == 0){
sum += numberCollected;
}
}
System.out.println("The sum of the numbers is: " + sum);
}
}