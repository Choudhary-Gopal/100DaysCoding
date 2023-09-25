  import java.util.Scanner;
class MonthlySalary{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
 	System.out.println("Please enter the basic Salary :");
	float a = sc.nextFloat();

	System.out.println("one day salary is :"+a/30);
  }
}