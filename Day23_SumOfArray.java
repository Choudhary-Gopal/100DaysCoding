import java.util.Scanner;

class SumOfArray{
public static void main(String args[]){
 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int [] a = new int[n];
    int sum = 0;
    
    for(int i=0; i<n; i++){
	System.out.print("a["+i+"]=");
        a[i] = sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
        
        sum = sum+a[i];
    }
 
        System.out.println("Sum = "+sum);
 
    
}
}