 import java.util.Scanner;
class ReversTheArray{
public static void main(String args[]){


Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
			System.out.println("Revers Array is: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}
}