 import  java.util.Scanner;
class nthFibonacciNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
int a=0 , b=1 , c;

for(int i=1; i<n; i++)
{
	c = a + b;
	a = b;
	b = c;
}
	System.out.println("The " + n + "th Fibonacci number is: "+a);

   }
}
