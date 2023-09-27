 import java.util.Scanner;
class CharacterCheck{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch = sc.nextLine().charAt(0);

if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	System.out.println("The character is an alphabet");
else if(ch>='0' && ch<='9')
	System.out.println("The character is a digit");
else 
	System.out.println("The character is special character");

  }
}