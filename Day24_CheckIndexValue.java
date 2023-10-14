 import java.util.Scanner;
class CheckIndexValue{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (a[i] == i + 1) {
				System.out.println("a[" + (i + 1) + "] = " + a[i]);
			}
		}
	}
}
	