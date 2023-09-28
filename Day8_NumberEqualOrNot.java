 import java.util.Scanner;
class NumberEqualOrNot{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first number:");
	int num1 = sc.nextInt();
	System.out.print("enter the first number:");
	int num2 = sc.nextInt();
	System.out.print("enter the first number:");
	int num3 = sc.nextInt();
if(num1 == num2 && num2==num3)
	System.out.println("number is equal");
else
	System.out.println("number is not equal");

  }
}