
public class Example3�� {

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
		 * a = 10; b = 5; System.out.println("a == b�� ����� : " + (a == b)); // false
		 * System.out.println("a != b�� ����� : " + (a != b)); // true
		 * System.out.println("a != b�� ����� : " + (a > b)); // true
		 * System.out.println("a != b�� ����� : " + (a < b)); // false
		 * System.out.println("a != b�� ����� : " + (a >= b)); // true
		 * System.out.println("a != b�� ����� : " + (a <= b)); // false
		 * 
		 * result = a > b;
		 * 
		 * System.out.printf("%d > %d�� ����� : %s", a, b, result); // true
		 */
		/*
		 * boolean d = true; boolean e = false;
		 * 
		 * System.out.println("�� and ���� �� : " + (d && d));
		 * System.out.println("�� and ������ �� : " + (d && e));
		 * System.out.println("���� and ���� �� : " + (e && d));
		 * System.out.println("���� and ������ �� : " + (e && e));
		 * 
		 * System.out.println("�� or ���� �� : " + (d || d));
		 * System.out.println("�� or ������ �� : " + (d || e));
		 * System.out.println("���� or ���� �� : " + (e || d));
		 * System.out.println("���� or ������ �� : " + (e || e));
		 */

		int x = 10;
		int y = 15;
		// AND �� �� �����ϴ���
		System.out.println(x > 5 && x < 25); // true
		System.out.println(x > 8 && x < 10); // false
		// OR �ϳ� �̻� �����ϴ���
		System.out.println(x > 15 || x < 25); // true
		System.out.println(x > 8 || x < 10); // true
	}

}
