import java.util.Scanner;

class PrintPrimeNumbers {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0, num;
		boolean isPrime = true;
		num = 2;
		while (count < n) {
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.print(num+" ");
			}
			num++;
			isPrime = true;
		}

	}
}
