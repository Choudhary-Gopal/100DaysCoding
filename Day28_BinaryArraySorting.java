import java.util.*;
class BinaryArraySorting{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int res = 0;
		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}