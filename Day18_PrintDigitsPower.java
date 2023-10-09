import java.util.Scanner;

class PrintDigitsPower {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		int digits = 0;
		int power = 1, d, revers = 0;

		while (n != 0) {
			d = n % 10;
			revers = revers * 10 + d;
			n = n / 10;
			++digits;
		}
		System.out.println("Numbers of digits: " + digits);
		System.out.println("Digits raised to the power of : "+digits);

		for (int i = 1; i <= digits; i++) {
			d = revers % 10;
			int res = 1;
			for (int j = 1; j <= digits; j++) {
				res = res * d;

			}
			revers = revers / 10;
			System.out.println(res);
		}

	}
}