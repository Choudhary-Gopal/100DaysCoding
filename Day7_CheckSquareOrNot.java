 import java.util.Scanner;
class CheckSquareOrNot{
public static void main(String args[]){

  	Scanner sc = new Scanner(System.in);
	System.out.print("please enter the length of square:");
	float l = sc.nextFloat();
	System.out.print("please enter the breadh of square:");
	float b = sc.nextFloat();

if(l == b)
	System.out.println("It is a square");
else 
	System.out.println("It is not a square");

  }
}