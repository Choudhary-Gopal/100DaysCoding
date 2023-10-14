 import java.util.Scanner;
class CheckSortedArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		boolean b = true;
		for (int i = 1; i < n; i++) {

			if (a[i] < a[i - 1]) {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("The given array is sorted");
		} else {
			System.out.println("The given array is not sorted");
		}
	}
}