import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String contString = "yes";

		while (contString.equalsIgnoreCase("yes")) {

			// Prompt user for name
			System.out.println("What's your name?");
			String userName = scan.next();

			// Prompt user for a number between 1 and 100
			System.out.println("Thanks, " + userName + ". Please enter a number between 1 and 100: ");
			int num = scan.nextInt();

			// conditional statement to only use numbers between 1 and 100
			if (num > 0 && num <= 100) {
				// using % (modulo finds remainder) to see if odd or even. If there's a
				// remainder the # is odd
				if (num % 2 != 0 && num < 60) {
					System.out.println("Ok, " + userName + " " + num + " is odd.");
				} else if (num % 2 != 0 && num > 60) {
					System.out.println("Ok, " + userName + "..." + num + " is odd and over 60.");
				} else if (num % 2 == 0 && num >= 2 && num <= 25) {
					System.out.println("Ok, " + userName + "...your number is even and less than 25");
				} else if (num % 2 == 0 && num >= 26 && num <= 60) {
					System.out.println("Ok, " + userName + "...your number is even.");
				} else {
					System.out.println("Ok, " + userName + "..." + num + " is even.");
				}
			} else {
				System.out.println("Listen up, " + userName
						+ ", you need to follow directions and enter a number between 1 and 100.");
			}
			System.out.println("Continue? (yes/no)");
			contString = scan.next();
			}
		System.out.println("Goodbye");
		scan.close();

	}
}


