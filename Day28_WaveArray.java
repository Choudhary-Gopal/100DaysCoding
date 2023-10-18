 import java.util.Scanner;
class WaveArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

	for (int i = 0; i < size; i++) {
		System.out.print("a[" + i + "] = ");
		arr[i] = sc.nextInt();
	}
		
	for(int i = 0 ;i< size-1 ;i=i+2){
            	int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }

	for(int i=0; i<size; i++){
		System.out.print(arr[i]+" ");
	}


   }
}
