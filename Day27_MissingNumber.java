 import java.util.Scanner;
class MissingNumber{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = sc.nextInt();
		int[] arr = new int[N - 1];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}

		int sum = N * (N + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing number is: "+sum);
																 	    }
}					