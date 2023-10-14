import java.util.Scanner;

class FindLargestElementinArray{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i=1; i<n; i++) {
			if(min<a[i]) {
				min=a[i];
			}
		}
			System.out.print("Largest element =  "+min);
		
		
}
}