 import java.util.Scanner;
class SumOfMultiplesOfSeven{
public static void main(String argsp[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = sc.nextInt();

int sum = 0;

for(int i=1; i<=n; i++)
{
   if(i%7==0)
   {
	sum = sum + i;
	System.out.println("Multiples of 7 is: "+i); 
    }
}

	System.out.println("\nSum of multiples of 1 to " + n + " is: " + sum);


  }
}