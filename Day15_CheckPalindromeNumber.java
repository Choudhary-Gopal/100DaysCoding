 import java.util.Scanner;
class CheckPalindromeNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int revers=0;
int n1 = n;

while(n1 != 0)
{
	int digit = n1%10;
	revers = revers*10 + digit;
	n1 = n1/10;
}

if(revers==n)
{
	System.out.println(n+" : is palindrome number");
}
else
{	
	System.out.println(n+" : is not palindrome number");
}


    }
}	