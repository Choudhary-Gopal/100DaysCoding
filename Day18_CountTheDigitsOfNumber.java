 import java.util.Scanner;
class CountTheDigitsOfNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int digit = 0;
int sum = 0;
int t;

while(n != 0)
{	
	t = n%10;
	sum = sum + t;	
	n = n/10;
	++digit;
}
	System.out.println("Number of digits: "+digit);
	System.out.println("Sum of numbers is: "+sum);	

   }
}	 