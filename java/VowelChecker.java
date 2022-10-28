import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter only one letter as an Input: ");
		char letter = scan.next().charAt(0);


		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println(letter + " is a Vowel");
		} else {
			System.out.println(letter + " is not a Vowel");
		}

		scan.close();
	}
}
