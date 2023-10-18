 import java.util.*;
class FirstElementOccureKTime{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean f = false;

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element: ");
		int k = sc.nextInt();

		int b[] = arr.clone();
		Arrays.sort(b);
		b = new int[b[size - 1] + 1];
		for (int i = 0; i < size; i++) {
			b[arr[i]]++;
			if (b[arr[i]] == k) {
				System.out.println(arr[i]);
				f = true;
				break;
			}
		}
		if (!f)
			System.out.println(-1);
	}

}
