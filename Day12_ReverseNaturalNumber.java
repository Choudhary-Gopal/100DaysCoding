 import java.util.Scanner;
class ReverseNaturalNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int number = sc.nextInt();
System.out.println("Natural numbers in reverse order from 1 to " + number + ":");

for(int i=1; number>=i; number--)

	System.out.println(number);

   }
}