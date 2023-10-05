 import java.util.Scanner;
class SumOfFecctorial{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int factorial = 1;

while(n != 0)
{
	n = n%10;
	int sum=0;
	for(int i=2; i<=n; i++)
	{
		factorial = factorial*i;
		System.out.println("Factorial of "+i+" is: "+factorial);
		sum = sum + factorial;
	}
	
	System.out.println("Sum of factorial is: "+sum);	
	n = n/10;
}

	

    }
}