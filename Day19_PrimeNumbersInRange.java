 import java.util.Scanner;
class PrimeNumbersInRange{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int n1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int n2 = sc.nextInt();

int j,i;

for(i=n1; i<=n2; i++)
{
	for(j=2; j<=i; j++)
	{
		if(i%j==0)
		break;
	}
	
		if(i == j)
		
			System.out.print(j+" ");
		
	
}
  


   }
}