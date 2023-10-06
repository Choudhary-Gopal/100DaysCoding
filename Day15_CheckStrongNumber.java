import java.util.Scanner;

class CheckStrongNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int n1 = number;
		int sum = 0;
		int f = 0;
		
		while (n1 != 0) {
			f = n1 % 10;
			int factors = 1;

			for (int i = 1; i <= f; i++) {
				factors = factors * i;
			}
			sum = sum + factors;

			n1 = n1 / 10;
		}
		System.out.println("sum of factors is: " + sum);
		
		if (sum == number)
			System.out.println(number + " : is storng number");
		else
			System.out.println(number + " : is not strong number");
	}
}
