package exercise5;

import java.util.Scanner;

public class Calculator {
	public static double calculate(double x, double y, String s) {
		if(s.equals("a")) {
			return x+y;
		}
		else if(s.equals("b")) {
			return x-y;
		}
		else if(s.equals("c")) {
			return x*y;
		}
		else if(s.equals("d")) {
			return x/y;
		}
		else if(s.equals("e")) {
			return Math.abs(x);
		}
		else if(s.equals("f")) {
			return Math.pow(x, 2);
		}
		else if(s.equals("g")) {
			return Math.pow(x, y);
		}
		else if(s.equals("h")) {
			return Math.sqrt(x);
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x:");
		double x = sc.nextDouble();
		System.out.print("Enter y:");
		double y = sc.nextDouble();
		System.out.print("Choose your corresponding letter of calculation:\n"
				+ "a.x+y\nb.x-y\nc.x*y\nd.x/y\ne.abs(x)\nf.x^2\ng.x^y\nh.sqrt(x)\n");
		String s =sc.next();
		System.out.print("Answer:"+calculate(x,y,s));
		
	}
}
