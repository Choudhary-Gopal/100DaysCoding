 import java.util.Scanner;
class PrintElementsInAlternateOrder{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int n = sc.nextInt();
	int[] a = new int[n];

for(int i=0; i<n; i++)
{
	System.out.print("a["+i+"] = ");
	a[i] = sc.nextInt();
}

	
for(int i=0; i<n; i++)
{
	if(i%2 == 0)
	{
		System.out.print(a[i]+" ");
	}
}


   }
}	