 import java.util.Scanner;
class AnyTablePrint{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int number = sc.nextInt();
for(int i=1; i<=10; i++)
{	
	int result = number*i;
	System.out.println(number+"*"+i+" = "+result);

}


   }
}