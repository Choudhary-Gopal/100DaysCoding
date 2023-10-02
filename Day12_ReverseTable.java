 import java.util.Scanner;
class ReverseTable{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("enter the number:");
	int number = sc.nextInt();

for(int i=10; i>=1; i--)
{
	int result = number*i;
	System.out.println(number+"*"+i+" = "+result);
}


   }
}
 