import java.util.Scanner;

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
		/*
		 * int x = 10; int y = 15; // AND �� �� �����ϴ��� System.out.println(x > 5 && x < 25);
		 * // true System.out.println(x > 8 && x < 10); // false // OR �ϳ� �̻� �����ϴ���
		 * System.out.println(x > 15 || x < 25); // true System.out.println(x > 8 || x <
		 * 10); // true
		 */
		/*
		 * int num = 0; int pay = 0; Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("�ο��� ���?"); num = input.nextInt();
		 * System.out.println("�ֹ� �ݾ���?"); pay = input.nextInt();
		 * 
		 * if (num >= 2 && pay >= 10000) {
		 * 
		 * System.out.println("���� �޴´�"); } else {
		 * 
		 * System.out.println("���� �� �޴´�"); }
		 * 
		 * int money = 0;
		 * 
		 * if (money >= 5000 && money < 10000) { System.out.println("��� ��� ����");
		 * 
		 * }
		 */
		int goal = 0; // 3000
		int plus = 0; // 750
		Scanner input = new Scanner(System.in);

		System.out.println("�Ǹŷ���?");
		goal = input.nextInt();
		System.out.println("���ͱ���?");
		plus = input.nextInt();

		float plusper = ((float) plus / goal) * 100;

		// System.out.printf("%.2f", plusper);
		if (goal >= 3000 && plusper >= 20) {
			System.out.println("���ʽ� ����");

		}

	}

}
