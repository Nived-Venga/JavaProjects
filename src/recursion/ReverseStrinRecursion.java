package recursion;

public class ReverseStrinRecursion {
	static String reverseString = "";
	static int index = 0;

	public static void main(String[] args) {
		System.out.println(Reverse("Nived"));
	}

	private static String Reverse(String str) {

		if (str.length() < 1) {

			return reverseString;
		} else {
			index = str.length();
			System.out.println(index);

			System.out.println((str.charAt(index - 1)));
			reverseString = reverseString + (str.charAt(index - 1));
			str = str.substring(0, index - 1);
			System.out.println(reverseString);
			Reverse(str);
		}
		return reverseString;

	}
}
