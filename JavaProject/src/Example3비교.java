
public class Example3비교 {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; int c = 30;
		 * 
		 * System.out.println(a < b); // true System.out.println(a > b); // false
		 * System.out.println(a + b <= c); // true System.out.println(a + b >= c); //
		 * true
		 * 
		 * boolean result = a > b;
		 */
		// System.out.println(result); // false

		/* ////////////////////////////////// */
		/*
		 * a = 10; b = 5; System.out.println("a == b의 결과는 : " + (a == b)); // false
		 * System.out.println("a != b의 결과는 : " + (a != b)); // true
		 * System.out.println("a != b의 결과는 : " + (a > b)); // true
		 * System.out.println("a != b의 결과는 : " + (a < b)); // false
		 * System.out.println("a != b의 결과는 : " + (a >= b)); // true
		 * System.out.println("a != b의 결과는 : " + (a <= b)); // false
		 * 
		 * result = a > b;
		 * 
		 * System.out.printf("%d > %d의 결과는 : %s", a, b, result); // true
		 */
		/*
		 * boolean d = true; boolean e = false;
		 * 
		 * System.out.println("참 and 참일 때 : " + (d && d));
		 * System.out.println("참 and 거짓일 때 : " + (d && e));
		 * System.out.println("거짓 and 참일 때 : " + (e && d));
		 * System.out.println("거짓 and 거짓일 때 : " + (e && e));
		 * 
		 * System.out.println("참 or 참일 때 : " + (d || d));
		 * System.out.println("참 or 거짓일 때 : " + (d || e));
		 * System.out.println("거짓 or 참일 때 : " + (e || d));
		 * System.out.println("거짓 or 거짓일 때 : " + (e || e));
		 */

		int x = 10;
		int y = 15;
		// AND 둘 다 만족하는지
		System.out.println(x > 5 && x < 25); // true
		System.out.println(x > 8 && x < 10); // false
		// OR 하나 이상 만족하는지
		System.out.println(x > 15 || x < 25); // true
		System.out.println(x > 8 || x < 10); // true
	}

}
