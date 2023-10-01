 import java.util.Scanner;
class AveragOfNumberOneToN{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number for print number of averag:");
	int number = sc.nextInt();
	float averag=0;

for(int i=1; i<=number; i++)
{
	averag = averag + i;
}
	System.out.println("averag = "+averag/number);


   }
}	
