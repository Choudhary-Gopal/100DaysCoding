 import java.util.Scanner;
class SortTheArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int countzero = 0, countone = 0, counttwo = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				countzero++;
			} else if (arr[i] == 1) {
				countone = countone + 1;
			} else if (arr[i] == 2) {
				counttwo++;
			}
		}

		int ind = 0;
		for (int i = 0; i < countzero; i++) {
			arr[ind++] = 0;
		}
		for (int i = 0; i < countone; i++) {
			arr[ind++] = 1;
		}
		for (int i = 0; i < counttwo; i++) {
			arr[ind++] = 2;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}


	