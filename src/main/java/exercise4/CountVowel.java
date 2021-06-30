package exercise4;

public class CountVowel {
	/*
	 * countVowel returns the counts of vowels in a string.
	 */
	public static int countVowel(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HCL Technologies";
		System.out.println(countVowel(str));
	}

}
