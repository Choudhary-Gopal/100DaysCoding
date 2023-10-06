 import java.util.Scanner;
class SumOfPreviousValue_And_CurrentValue{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int sum = 0;

for(int i=1; i<=n; i++)
{
	System.out.print(sum);
	sum = sum + i;
	System.out.println(" + "+i+" = "+sum);
}
  

  }
}	