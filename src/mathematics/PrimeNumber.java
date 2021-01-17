package mathematics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("0 is neither prime nor composite");
		} else if (number == 1) {
			System.out.println("1 is neither prime nor composite");

		} else {
			int count = 0;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println(number + " is prime");
			} else {
				System.out.println(number + " is not prime");
			}
		}

	}

}
