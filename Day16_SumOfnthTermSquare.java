import java.util.Scanner;

class SumOfnthTermSquare {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		int square = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			square = i * i;
			System.out.println("square of " + i + " is: " + square);
			sum = sum + square;
		}
		System.out.println("Sum of squares is: " + sum);

	}
}