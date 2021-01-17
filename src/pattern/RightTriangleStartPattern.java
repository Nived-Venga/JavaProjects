package pattern;

public class RightTriangleStartPattern {

	public static void main(String[] args) {
		char x = '*';
		int row = 5;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(x);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
