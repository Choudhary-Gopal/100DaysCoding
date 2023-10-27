 import java.util.Scanner;
class ElementsInTheRange{
public static void main(String... args){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the first value: ");
		int A = sc.nextInt();
		System.out.print("Enter the second value: ");
		int B = sc.nextInt();

		int[] a = new int[B + 1];
		for (int i = 0; i < size; i++) {
			if (arr[i] >= A && arr[i] <= B) {
				a[arr[i]]++;
			}
		}
		boolean f = true;
		for (int i = A; i <= B; i++) {
			if (a[i] == 0) {
				f = false;
				break;

			}
		}
		System.out.println(f);

	}
}