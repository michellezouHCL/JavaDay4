package exercise2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cat1 = "cat";
		String cat2 = "cat";

		System.out.println(cat1 == cat2);
		
		StringBuilder cat3 = new StringBuilder();
		cat3.append("cat");
		System.out.println(cat3.equals(cat1));
	}

}
