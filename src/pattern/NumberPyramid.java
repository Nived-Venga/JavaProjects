package pattern;

public class NumberPyramid {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();

		}

		int m = 1;
		System.out.println();
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println();

		}

		System.out.println();
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");

			}
			System.out.println();

		}
	}
}
