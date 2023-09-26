 import java.util.Scanner;
class WeekNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("plese enter the week number : ");
	int num = sc.nextInt();	

if(num==0)
	System.out.println(num+" :Monday");
else if(num==1)
	System.out.println(num+" :Tuesday");
else if(num==2)
	System.out.println(num+" :Wednesday");
else if(num==3)
	System.out.println(num+" :Thursday");
else if(num==4)
	System.out.println(num+" :Friday");
else if(num==5)
	System.out.println(num+" :Saturday");
else if(num==6)
	System.out.println(num+" :Sunday");
else 
	System.out.println("Week number is wrong");
 }
}



