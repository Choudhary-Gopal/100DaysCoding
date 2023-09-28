 import java.util.Scanner;
class IncreasingDecreasingNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int number1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int number2 = sc.nextInt();
	System.out.print("Enter the third number: ");
	int number3 = sc.nextInt();

if (number1 < number2 && number2 < number3) 
            System.out.println("Numbers are in increasing order.");
else if (number1 > number2 && number2 > number3) 
            System.out.println("Numbers are in decreasing order.");
else 
            System.out.println("Numbers are in no specific order.");

  }
}