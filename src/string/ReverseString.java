package string;

public class ReverseString {
	static String reverse = "";

	public static void main(String[] args) {
		System.out.println(Reverse("Nived"));
	}

	private static String Reverse(String string) {

		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);

		}
		return reverse;

	}

}
