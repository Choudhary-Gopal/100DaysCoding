 import java.util.Scanner;
class PlayWithOR{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i] | arr[i + 1];
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
