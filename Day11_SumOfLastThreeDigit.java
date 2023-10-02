 import java.util.Scanner;
class SumOfLastThreeDigit{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter  the number :");
	int number = sc.nextInt();
	int sum = 0;

int ThreeDigit = number%1000;
	System.out.println("last three digit is :"+ThreeDigit);
	
while(ThreeDigit>0)
{
	int digit = ThreeDigit % 10;
            sum = sum + digit;
            ThreeDigit = ThreeDigit/10;
}
		System.out.println("Sum of the last 3 digits is: " + sum);

  }
}