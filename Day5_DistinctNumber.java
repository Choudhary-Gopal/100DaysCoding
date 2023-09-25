import java.util.Scanner;
class DistinctNumber{
public static void main(String args[]){
 
	Scanner sc = new Scanner(System.in);
  	System.out.println("subject 1 = ");
	int a = sc.nextInt();
	System.out.println("subject 2 = ");
	int b = sc.nextInt();
	System.out.println("subject 3 = ");
	int c = sc.nextInt();
	
if(a>=75)
	System.out.println("distinct subject number is : "+a);
else if(b>=75)
	System.out.println("distinct subject number is : "+b);
else 
	System.out.println("distinct subject number is : "+c);
  }
}