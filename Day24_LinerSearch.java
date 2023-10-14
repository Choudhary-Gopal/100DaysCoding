 import java.util.Scanner;
class LinerSearch{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int size = sc.nextInt();
	int[] a = new int[size];

	for (int i = 0; i < size; i++) 
	{
	System.out.print("a[" + i + "] = ");
		a[i] = sc.nextInt();
	}
	System.out.print("chek element: ");
	int check = sc.nextInt();
		
	boolean b = true;
		
	for(int i=0; i<size; i++)
	 {
			
		if(a[i] == check) 
		{
			System.out.println(check +" at index: "+i);
			b = false;
		}
			
	}
	if(b) 
	{
		System.out.println("Element is not found");
	}
		
		
	}
}