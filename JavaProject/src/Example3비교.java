
public class Example3ºñ±³ {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(a + b <= c); // true
		System.out.println(a + b >= c); // true

		boolean result = a > b;
		System.out.println(result); // false

		/* ////////////////////////////////// */

		a = 10;
		b = 5;

		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // true
		System.out.println(a <= b); // false

		result = a > b;
		System.out.println(result); // true

	}

}
