 import java.util.Scanner;
class SecondLargestElement{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int prev = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				prev = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > prev) {
				prev = arr[i];
			}
		}

		System.out.println("Second largest element: "+prev);

	}

}

