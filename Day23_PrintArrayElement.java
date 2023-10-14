 import java.util.Scanner;
class PrintArrayElement{
public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		int j = 0;

		for (int i = 0; i < n; i++) {
			a[i] = j++;
		}

		System.out.print("[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);

			if (i < n - 1) {
				System.out.print(", ");
			}

		}
		System.out.print("]");


  }
}