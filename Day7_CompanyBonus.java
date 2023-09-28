 import java.util.Scanner;
class CompanyBonus{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the year of joining:");
	float year = sc.nextFloat();

if(year>=5)
{
	System.out.print("Enter employee's salary:");
	float salary = sc.nextInt();
	System.out.println("your bonus amount is :$ "+(salary*5)/100;
}
else
	System.out.println("Sorry, you are not eligible for a bonus");
 
  }
} 
