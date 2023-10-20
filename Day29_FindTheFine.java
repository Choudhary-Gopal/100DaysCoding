 import java.util.Scanner;
class FindTheFine{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		int car[] = { 2375, 7682, 2325, 2352 };
		int fine[] = { 250, 500, 350, 200 };
		int sum = 0;

		System.out.print("Enter the date: ");
		int date = sc.nextInt();
		for (int i = 0; i < car.length; i++) {
			if (date % 2 == 0 && car[i] % 2 != 0) {
				sum = sum + fine[i];
			}
			else if (date % 2 != 0 && car[i] % 2 == 0) {
				sum = sum + fine[i];
			}
		}

		System.out.println(sum);
	}

}
