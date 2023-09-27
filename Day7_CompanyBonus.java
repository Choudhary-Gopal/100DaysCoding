 import java.util.Scanner;
class CompanyBonus{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the year of joining:");
	float year = sc.nextFloat();

if(year>=5)
{
	System.out.print("Enter employee's salary:");
	float s = sc.nextInt();
	System.out.println("your bonus amount is :$ "+s/5);
}
else
	System.out.println("Sorry, you are not eligible for a bonus");
 
  }
} 