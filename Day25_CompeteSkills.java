 import java.util.Scanner;
class CompeteSkills{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];

		int ca = 0, cb = 0;
		System.out.print("A=");
		for (int i = 0; i < size; i++) {
			// System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("B=");

		for (int i = 0; i < size; i++) {
			// System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {

			if (a[i] < b[i]) {
				cb++;
			} else if (a[i] > b[i]) {
				ca++;
			}
		}
		System.out.println("a=" + ca);
		System.out.println("b=" + cb);

	}
}