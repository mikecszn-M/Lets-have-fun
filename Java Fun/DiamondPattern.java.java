import java.util.Scanner;

public class DiamondPattern {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an odd number of rows: ");
int number = scanner.nextInt();

if (number <= 0 || number % 2 == 0) {
System.out.println("Invalid");
} 
else {
int level_1 = 1;
for(level_1 = 1; level_1 <= number; level_1 += 2){
for(int space = 1; space <= number; space++){
System.out.print(" ");
for(int asterik = 1; asterik <= level_1; asterik ++){
System.out.println("* ");
}
}
}
}
for(int level_2 = number; level_2 >= 1; level_2 -= 2){
for(int space_2 = number; space_2 >= 1; space_2--){
System.out.print(" ");
for(int asterik_2 = number; asterik_2 >= number; asterik_2 --){
System.out.println("* ");
}
}
}
}
}
            