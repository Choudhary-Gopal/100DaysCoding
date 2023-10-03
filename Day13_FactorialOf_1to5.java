class FactorialOf_1to5{
public static void main(String args[]){

for(int n=1; n<=5; n++)
{
    int factorial = 1;
    for(int i=1; i<=n; i++)
    {
	factorial = factorial*i;
     }
		
	System.out.println("Factorial of "+n+" is: "+factorial);

}


   }
} 