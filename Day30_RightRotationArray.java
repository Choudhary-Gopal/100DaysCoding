 import java.util.Scanner;
class RightRotationArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the rotate time: ");
		int d = sc.nextInt();

		while (d != 0) {
			int tem = arr[size - 1];
			for (int i = size - 1; i > 0; i--) {

				arr[i] = arr[i - 1];
			}
			arr[0] = tem;
			d--;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
