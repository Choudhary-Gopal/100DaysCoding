 import java.util.*;
class MultiplyAndArraySum{
public static void main(String... args){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int i = 0, count = 0;
		for (; i < size / 2; i++) {
			count = count + arr[i];
		}
		int count1 = 0;
		for (; i < size; i++) {
			count1 = count1 + arr[i];
		}

		int res = count * count1;
		System.out.println(res);

	}
}