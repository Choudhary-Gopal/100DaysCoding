 import java.util.Scanner;
class LastDigitNumbe{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the two digit number : ");
	int num = sc.nextInt();

	System.out.println("Last number is :"+num%10);
 }
}

	