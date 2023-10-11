 import java.util.Scanner;
class CheckHarshadNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int a,sum=0,i=1;
int n1 = n;

while(i<=n1)
{
	a = n1%10;
	sum = sum + a;
	n1 = n1/10;
}

if(n%sum == 0)
{
	System.out.println("Yes, " + n + " is a Harshad number.");
}
else 
{
	System.out.println("No, " + n + " is a Harshad number.");
}



   }
}		