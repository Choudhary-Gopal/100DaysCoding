 import java.util.Scanner;
class PrintMultiplesOf4Series{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();

int m = 1;
	System.out.print(m+" ");

for(int i=1; i<n; i++)
{
	m = m + 4;
	System.out.print(m+" ");
}


    }
}