package recursion;

import java.util.Scanner;

public class Palindrome {

	int result;
	static String x = "";

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("Reverse of the input number is:");
		palindrome(num);
		System.out.println();

		if (x.equalsIgnoreCase(String.valueOf(num))) {
			System.out.println("Number is a palindrome");
		} else

		{
			System.out.println("Number is not a palindrome");
		}

	}

	private static void palindrome(int number) {

		if (number < 10) {
			x = x.concat(String.valueOf(number % 10));
			System.out.println(x);

		} else {
			x = x.concat(String.valueOf(number % 10));
			palindrome(number / 10);
		}

	}

}
