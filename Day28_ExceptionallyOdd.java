 import java.util.Scanner;
class ExceptionallyOdd{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int[] a = new int[10000];
		for (int i = 0; i < size; i++) {
			a[arr[i]] += 1;
		}
		for (int i = 0; i < 10000; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
