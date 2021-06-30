package exercise1;

/*
 * UserMainCode class includes a checkCharacters 
 * method that checks if the first and last characters are same.
 */

public class UserMainCode {

	static int checkCharacters(String str) {
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
		if (first == last) {
			return 1;
		}
		return -1;
	}
}
