 import java.util.Scanner;
class ReplaceNumber{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int tem = 0, ans = 0;
		while (n != 0) {
			tem = n % 10;
			if (tem == 0) {
				tem = 5;
			}
			ans = ans * 10 + tem;
			n = n / 10;
		}

		tem = 0;
		while (ans != 0) {
			tem = tem * 10 + ans % 10;
			ans = ans / 10;
		}
		System.out.println(tem);
	}
}
