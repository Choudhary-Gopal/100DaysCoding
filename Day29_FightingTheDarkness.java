 import java.util.Scanner;
class FightingTheDarkness{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int maxCandles = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > maxCandles) {
				maxCandles = arr[i];
			}
		}
		System.out.println(maxCandles);

	}
}
