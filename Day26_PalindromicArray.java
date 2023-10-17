 import java.util.Scanner;
class PalindromicArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int isPalindrom = 1;
		for (int i = 0; i < size; i++) {
			int temp = arr[i];
			int rev = 0;
			while (temp != 0) {
				rev = rev * 10 + temp % 10;
				temp /= 10;
			}
			if (rev != arr[i]) {
				isPalindrom = 0;
				break;
			}
		}
		System.out.println(isPalindrom);

	}

}
