 import java.util.Scanner;
class NumberOfOccurance{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		int count = 0;
		System.out.print("Enter the elements: ");
		int x = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (a[i] == x) {
				++count;
			}

		}
		System.out.println(count);
	}
}