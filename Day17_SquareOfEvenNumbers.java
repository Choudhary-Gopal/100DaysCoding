 import java.util.Scanner;
class SquareOfEvenNumbers{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int square = 1;

for(int i=1; i<=n*2; i++)
{
	if(i%2==0)
	{
		square = i *i;
		System.out.print(square+" ");
	}
}


   }
}