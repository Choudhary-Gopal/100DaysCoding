 import java.util.Scanner;
class ChocolatesLoves{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
	
		int min = arr[0];
       		 for(int i=0; i<size; i++){
         	   if(arr[i]<min){
          	     min = arr[i]; 
         	   }
     		 }
      		System.out.println(min);

	}
}
