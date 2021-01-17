package mathematics;

public class SwapTwoVariables {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		a = a + b; // 11
		b = a - b; // 6
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}
}
