 import java.util.Scanner;
class CheckFibonacciNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int a=0 , b=1, c=0;

while(c<n)
{
	c = a + b;
	a = b;
	b = c;
	if(c == n)
	{
		break;
	}
}


	
if(c == n)
{
	System.out.println(n+" is fabonacci number");
}

else
{
	System.out.println(n+" is not fabonacci number");
}


  }
}
