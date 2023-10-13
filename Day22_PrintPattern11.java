 import java.util.Scanner;
class PrintPattern11{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

for(int i=1; i<=n; i++)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print(j);
	}
	
	for(int k=1; k<=2*(n-i); k++)
	{
		System.out.print(" ");
	}

	for(int m=i; m>=1; m--)
	{

		System.out.print(m);
	}

		System.out.println();
}


  }
}