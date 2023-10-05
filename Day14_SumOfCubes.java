 import java.util.Scanner;
class SumOfCubes{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int sum = 0;

for(int i=1; i<=n; i++)
{
	int cube = i*i*i;
	sum = sum + cube;
	System.out.println("Cube of "+i+" is: "+cube);
}

	System.out.println("\nSum of cubes from 1 to " + n + " is: " + sum);

   }
}