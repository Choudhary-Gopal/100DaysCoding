 import java.util.Scanner;
class CheckPrimeNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();

boolean b = true;

for(int i=2; i<=(n/2); i++)
{
	if(n%i==0)
	{
		b = false;
		break;
	}
}

	if(b==true)
		System.out.println(n+" : is prime number");
	else 
		System.out.println(n+" : is not prime number");

   }
}
