import java.util.Scanner;

public class vowelCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Input: ");
		String input = scan.nextLine();

		while (input.length() != 1) {
			System.out.println("Input should contain only one letter");

			System.out.println("Enter Input: ");
			input = scan.nextLine();
		}

		char ch = input.toLowerCase().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("It is a vowel");
		else
			System.out.println("It is NOT a vowel");

		scan.close();
	}

}