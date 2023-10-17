 import java.util.Scanner;
class SearchingNumber{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("check nuumber: ");
		int k = sc.nextInt();
		boolean b = false;
		int tem = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] == k) {
				tem = a[i + 1];
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println(tem);
		} else {
			System.out.println("-1");
		}

	}
}