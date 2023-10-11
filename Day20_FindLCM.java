import java.util.Scanner;
class FindLCM{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int n1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int n2 = sc.nextInt();

int big = (n1>n2) ? n1 : n2;


for(int LCM = big; LCM<=n1*n2; LCM++)
{
	if(LCM%n1==0 && LCM%n2==0)
	{
		System.out.println("LCM is: "+LCM);
		break;
	}
}



   }
}