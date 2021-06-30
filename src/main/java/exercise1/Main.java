package exercise1;

import java.util.Scanner;

/*
 * Main class gets the input String and call the static method 
 * checkCharacters present in the UserMainCode to check if the 
 * first character of the input String is the same as the last 
 * character.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Input String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int result = UserMainCode.checkCharacters(input);

		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
