 import java.util.Scanner;
class AbsolutValue{
public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	System.out.print("enter the the value : ");
	int a = sc.nextInt();

if(a>=0)
	System.out.println("absolut value :"+a);
else
	System.out.println("absolut value :"+(-a));

  }
}