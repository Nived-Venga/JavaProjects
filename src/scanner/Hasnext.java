package scanner;

import java.util.Scanner;

public class Hasnext {

	public static void main(String[] args) {/*
											 * 
											 * Scanner sc = new Scanner(System.in);
											 * 
											 * int i = 1; while (sc.hasNext()) { System.out.println(i + " " +
											 * sc.nextLine()); i++; }
											 */

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (scan.hasNext()) {
			i++;
			System.out.println(i + " " + scan.nextLine());
		}

	}

}
