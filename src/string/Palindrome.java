package string;

import java.util.Scanner;

public class Palindrome {
	static Scanner myObj = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String x = myObj.next();
		int j = x.length() - 1;
		int half_length = x.length() / 2;
		int count = 0;
		for (int i = 0; i < half_length; i++) {
			if (Character.valueOf(x.charAt(i)).equals(Character.valueOf(x.charAt(j)))) {
				j--;
				count++;
			} else {
				System.out.println("The String is not a palindrome");
				System.out.println("The Character at " + (i + 1) + " " + x.charAt(i)
						+ " is not matching with character at " + (j + 1) + " " + x.charAt(j));
				break;
			}

		}

		if (count == half_length)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}
