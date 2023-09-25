 import java.util.Scanner;
class Rectangle{
public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	System.out.print("Length = ");
        int Length = sc.nextInt();
	System.out.print("width = ");
	int width = sc.nextInt();
 
System.out.println("Perimeter of rectangle is ; "+ 2*(Length+width));
 }
}