 import java.util.*;
class AtleastTwoGreater{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int[] a = new int[size-2];
		for(int i=0; i<size-2;i++) {
			a[i] = arr[i];
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}