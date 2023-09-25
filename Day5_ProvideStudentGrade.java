import java.util.Scanner;
class ProvideStudentGrade{
public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your percentage :");
	int per1 = sc.nextInt();

if(per1>75 && per1<=100)
	System.out.println("grade is : A ");
else if(per1>40 && per1<=75)
	System.out.println("grade is : B");
else
	System.out.println("grade is : C");

	System.out.print("Enter your percentage :");
	int per2 = sc.nextInt();

if(per2>75 && per2<=100)
	System.out.println("grade is : A ");
else if(per2>40 && per2<=75)
	System.out.println("grade is : B");
else
	System.out.println("grade is : C");

	System.out.print("Enter your percentage :");
	int per3 = sc.nextInt();	

if(per3>75 && per3<=100)
	System.out.println("grade is : A ");
else if(per3>40 && per3<=75)
	System.out.println("grade is : B");
else
	System.out.println("grade is : C");


 }
}
 	 
