 import java.util.Scanner;
class CountSquares{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; i<Math.sqrt(n); i++) {
		
			int square = i*i;
			if(square<n) {
				count++;
			}
		}
		System.out.println("Squares is: "+count);
		
	}

}
