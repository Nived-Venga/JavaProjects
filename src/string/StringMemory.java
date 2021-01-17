package string;

public class StringMemory {

	String a = "a";
	String b = "a";
	String c = "a";
	final String d = "a";
	String e = "a";

	String aa = new String("a");
	String bb = new String("a");
	String cc = new String("a");
	final String dd = new String("a");
	String ee = new String("a");

	public static void main(String[] args) {

		StringMemory m = new StringMemory();

		System.out.println(m.a == m.b);
		System.out.println(m.a == m.c);
		System.out.println(m.a == m.d);
		System.out.println(m.a == m.e);

		System.out.println(m.b == m.c);
		System.out.println(m.b == m.d);
		System.out.println(m.b == m.e);
		System.out.println(m.b == m.a);

		System.out.println(m.c == m.a);
		System.out.println(m.c == m.b);
		System.out.println(m.c == m.d);
		System.out.println(m.c == m.e);

		System.out.println(m.d == m.a);
		System.out.println(m.d == m.b);
		System.out.println(m.d == m.c);
		System.out.println(m.d == m.e);

		System.out.println(m.e == m.a);
		System.out.println(m.e == m.b);
		System.out.println(m.e == m.c);
		System.out.println(m.e == m.d);

		System.out.println(m.aa == m.bb);
		System.out.println(m.aa == m.cc);
		System.out.println(m.aa == m.dd);
		System.out.println(m.aa == m.ee);

		System.out.println(m.bb == m.cc);
		System.out.println(m.bb == m.dd);
		System.out.println(m.bb == m.ee);
		System.out.println(m.bb == m.aa);

		System.out.println(m.cc == m.aa);
		System.out.println(m.cc == m.bb);
		System.out.println(m.cc == m.dd);
		System.out.println(m.cc == m.ee);

		System.out.println(m.dd == m.aa);
		System.out.println(m.dd == m.bb);
		System.out.println(m.dd == m.cc);
		System.out.println(m.dd == m.ee);

		System.out.println(m.ee == m.aa);
		System.out.println(m.ee == m.bb);
		System.out.println(m.ee == m.cc);
		System.out.println(m.ee == m.dd);

	}
}
