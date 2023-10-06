 import java.util.Scanner;
class PrintSumOfTheSeries{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int sum = 0;
int t = 0;

for(int i=1; i<=n; i++)
{
	
	t = t*10 + 2;
	System.out.print(t);
	if(i<n)
	{
		System.out.print("+");
	}
	sum = sum + t;
	
}
	System.out.print("\nSum: "+sum);
  
   }
}