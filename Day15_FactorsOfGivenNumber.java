 import java.util.Scanner;
class FactorsOfGivenNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

 	System.out.print("Factors of "+n+" is: ");

for(int i=1; i<n; i++)
{
	if(n%i==0)
	{
		System.out.print(i+",");	
	}
	
}	
	
		



     }
}