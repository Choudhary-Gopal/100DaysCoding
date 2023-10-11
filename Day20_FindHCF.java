 import java.util.Scanner;
class FindHCF{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int n1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int n2 = sc.nextInt();

int HCF = 0;

for(int i=2; i<=n1 || i<=n2; i++)
{
	if(n1%i==0 && n2%i==0)
	{
		HCF = i;
		
	}
}
		System.out.println("HCF is: "+HCF);

  }
}