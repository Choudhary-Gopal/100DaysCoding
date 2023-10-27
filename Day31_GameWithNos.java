 import java.util.*;
class GameWithNos{
public static void main(String... args){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<size-1; i++){
            		int a =arr[i];
           		 int b = arr[i+1];
           		 arr[i] = a^b;
            
       		 }
    		   for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
    		}

   }
}