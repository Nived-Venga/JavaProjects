package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstTwoMaxValuesFromArray {

	static Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 85, 45, 19, 2, 15, 94, 44, 15, 26, 185, 1515, 1, 0,
			51, 5 };
	static List<Integer> brr;

	public static void main(String[] args) {

		brr = Arrays.asList(arr);
		brr.sort(Comparator.reverseOrder());
		System.out.println(brr);
		System.out.println(brr.get(0));
		System.out.println(brr.get(1));
	}
}
