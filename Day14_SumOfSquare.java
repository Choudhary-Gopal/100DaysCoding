 import java.util.Scanner;
class SumOfSquare{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int sum = 0;
for(int i=1; i<=n; i++)
{
	sum = sum +i*i;
}
	System.out.println("Sum of squares from 1 to " + n + " is: "+sum);

  }
}
	