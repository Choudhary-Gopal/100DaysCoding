 import java.util.Scanner;
class CountSmallerElements{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("Smller number: ");
		int s = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {

			if (a[i] <= s) {
				count++;

			}

		}
		System.out.println(count);
	}
}