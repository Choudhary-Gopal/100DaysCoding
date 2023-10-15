 import java.util.Scanner;
class CheckPerfectArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int s = size;
		boolean b = true;

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size / 2; i++) {
			if (a[i] != a[(size - 1) - i]) {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("array is perfect");
		} else {
			System.out.println("array is not perfect");
		}

	}
}