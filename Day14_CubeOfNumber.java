 import java.util.Scanner;
class CubeOfNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
int cube = 1;

for(int i=1; i<=n; i++)
{
	cube = i*i*i;
	System.out.println("Cube of " + i + " is: " + cube);
}



   }
}