  import java.util.Scanner;
class ProvideStudentGrade{
public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your percentage :");
	int per = sc.nextInt();

if(per>75 && per<=100)
	System.out.println("grade is : A ");
else if(per>40 && per<=75)
	System.out.println("grade is : B");
else
	System.out.println("grade is : C");
 }
}
 	 