 import java.util.Scanner;
class Calculator{
public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first value:");
	float a = sc.nextFloat();
	System.out.print("enter the second value:");
	float b = sc.nextFloat();
	
System.out.println(" 1)  Addition");
System.out.println(" 2)  Subtraction");
System.out.println(" 3)  Multiplication");
System.out.println(" 4)  Division");

	System.out.print("enter the choise:");
	int choise = sc.nextInt();
	float c;


switch(choise){
	case 1:
		c = a+b;		
		System.out.println("a+b="+c);
		break;
	case 2:
		c = a-b;
		System.out.println("a-b="+c);
		break;
	case 3:
		c = a*b;
		System.out.println("a*b="+c);
		break;
	case 4:
		c = a/b;
		System.out.println("a/b="+c);
		break;
	default:
		System.out.println("invalid choise");
}


   }
}