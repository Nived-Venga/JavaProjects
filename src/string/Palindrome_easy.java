package string;

import java.util.Scanner;

public class Palindrome_easy {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String x = myObj.next();
		String y = "";
		for (int i = x.length() - 1; i >= 0; i--) {

			y = y + x.charAt(i);
		}
		System.out.println(y);

		if (x.equals(y)) {
			System.out.println(x + " is a palindrome");
		} else {
			System.out.println(x + " is not a palindrome");
		}
	}

}
