import java.util.Scanner;
class CubeOfEverySingleDigit{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int d;
int revers = 0;
int cube;

while(n != 0)
{
	d = n%10;
	revers = revers*10 + d;
	n = n/10;
}	

while(revers != 0)
{
	d = revers%10;
	cube = d *d *d;
	System.out.print(cube+" ");
	revers = revers/10;
}	
		
	
    }
}