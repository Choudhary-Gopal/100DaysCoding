 import java.util.Scanner;
class TraingleChek{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first side of traingle S1=");
	int S1 = sc.nextInt();
	System.out.print("enter the first side of traingle S2=");
	int S2 = sc.nextInt();
	System.out.print("enter the first side of traingle S3=");
	int S3 = sc.nextInt();

if((S1+S2)>=S3 && (S2+S3)>=S1 && (S1+S3)>S2)
	System.out.println("Valid");
else
	System.out.println("Invalid");
  }
}