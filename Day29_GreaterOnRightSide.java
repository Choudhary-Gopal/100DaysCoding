import java.util.Scanner;
class GreaterOnRightSide{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int max = arr[size - 1];
		arr[size - 1] = -1;
		for (int i = size - 2; i >= 0; i--) {
			int tem = arr[i];
			arr[i] = max;
			if (max < tem) {
				max = tem;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}