 import java.util.Scanner;
class SmallerAndLarger{
public static void main(String... args){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number: ");
		int x = sc.nextInt();

		int count =0;
		for(int i=0; i<size; i++){
			if(arr[i]<=x){
				count++;
			}
		}

		int  c = size - count;
		System.out.println(count);
		System.out.println(c);

  }
}