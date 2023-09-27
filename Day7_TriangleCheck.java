 import java.util.Scanner;
class TriangleCheck{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first angle: ");
	int angle1 = sc.nextInt();
	System.out.print("Enter the second angle:[");
	int angle2 = sc.nextInt();
	System.out.print("Enter the third angle: ");
	int angle3 = sc.nextInt();	

if((angle1+angle2+angle3)==180)
	System.out.println("The triangle is valid");
else

	System.out.println("The triangle is not valid");	

  }
}