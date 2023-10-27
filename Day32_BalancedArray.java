 import java.util.Scanner;
class BalancedArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		int i = 0;
		int sum = 0;
		for (; i < size / 2; i++) {
			sum = sum + arr[i];
		}
		int sum1 = 0;
		for (; i < size; i++) {
			sum1 = sum1 + arr[i];
		}
		if (sum > sum1) {
			System.out.println(sum - sum1);
		} else {
			System.out.println(sum1 - sum);
		}

	}

}
