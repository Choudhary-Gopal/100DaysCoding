 import java.util.Scanner;
class SwapkthElement{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the kth number: ");
		int kth = sc.nextInt();
		
		int temp = a[kth-1];		
		a[kth-1] = a[size-kth];
		a[size-kth] = temp;
		
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}