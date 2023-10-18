 import java.util.Scanner;
class CountDigit{
public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		int tem = 0, n1 = n;
		while (n != 0) {
			tem = n % 10;
			if (tem > 0 && n1 % tem == 0) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);
	}

}
