import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a character:");
        char al = sc.next().charAt(0);

      

            if (al=='a' || al=='e' || al=='i' || al=='o' || al=='u' || al=='A' || al=='E' || al=='I' || al=='O' || al=='U')
                System.out.println("Alphabet is a vowel :"+al);
            else
                System.out.println("Alphabet is a consonant:"+al);
      
    }
}
