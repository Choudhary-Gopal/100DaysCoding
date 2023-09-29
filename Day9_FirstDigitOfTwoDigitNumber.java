 import java.util.Scanner;
class FirstDigitOfTwoDigitNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("please enter the two digit number:");
	int number = sc.nextInt();
if(number>=10 && number<=99)
	System.out.println("The first digit is:"+number/10);
else 
	System.out.println("number is incorrect");

  }
}
 