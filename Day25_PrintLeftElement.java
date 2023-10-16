 import java.util.*;
class PrintLeftElement{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the array size: " );
	int size = sc.nextInt();
	int[] arr = new int[size];
	
	for(int i=0; i<size; i++){
		System.out.print("a[" + i + "] = ");
		arr[i] = sc.nextInt();
	}

	
        Arrays.sort(arr);
        System.out.println(arr[((int)size-1)/2]);
     }
}
