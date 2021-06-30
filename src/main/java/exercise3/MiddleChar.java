package exercise3;

public class MiddleChar {
	/*
	 * MiddleChar class includes middleChar method that returns 1 middle character if odd and 2 if even.
	 */
	public static String middleChar(String str) {
		String result = "";
		int len = str.length();
		int mid = str.length() / 2;
		if (len % 2 == 0) {
			result = str.substring(mid - 1, mid + 1);
		} else {
			result += str.charAt(mid);
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "367455";
		System.out.println(middleChar(s));
	}

}
