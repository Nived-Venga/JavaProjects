package string;

public class ReverseStringUsingStringBuffer {

	private static String str = "acxxxdd";
	static StringBuffer builder;

	public static void main(String[] args) {
		builder = new StringBuffer(str);
		System.out.println(builder.reverse());
	}

}
