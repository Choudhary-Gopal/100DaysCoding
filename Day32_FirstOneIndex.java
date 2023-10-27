 import java.util.Scanner;
class FirstOneIndex{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		boolean b = false;
		int tem = 0;

		for (int i = 0; i < size; i++) {
			if (arr[i] == 1) {
				b = true;
				tem = i;
				break;
			}
		}
		if (b == true) {
			System.out.println(tem);
		} else {
			System.out.println("-1");
		}
	}

}
