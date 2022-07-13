
package Ch06_Class_Review;

import java.util.Scanner;

public class _02_1_Sum_Method {
	/**
	 * 대충 연습용 클래스.
	 */
	int a = 0;
	int b = 0;

	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값은?");
		a = sc.nextInt();
		System.out.println("b의 값은?");
		b = sc.nextInt();
	}

	public void sum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("a, b 두 값을 입력 받아 합을 구하고자 한다.");

		scan();

		int sum = a + b;

		System.out.println(a + " + " + b + " = " + sum);
	}

	/**
	 * 우상이 직각인 이등변 삼각형을 생성한다. 한 변의 길이를 인수로 받는다.
	 * 
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 */
	public void cha() {

		System.out.println("a, b 두 값을 입력 받아 차이를 구하고자 한다.");

		scan();

		int cha = a - b;

		System.out.println(a + "와 " + b + "의 차는 " + Math.abs(cha) + "이다.");
	}

	public void mal() {

		System.out.println("a, b 두 값을 입력 받아 곱를 구하고자 한다.");

		scan();

		int mal = a * b;

		System.out.println(a + " * " + b + " = " + mal);
	}

	public void select() {
		System.out.println("<<<<<<<<<<두수의 합, 차이, 곱을 구하는 프로그램>>>>>>>>>>");
		Scanner sc1 = new Scanner(System.in);
		while (true) {
			System.out.print("선택 1(합), 2(차이). 3(곱), 0(종료) : ");
			int select = sc1.nextInt();
			if (select == 1) {
				sum();
				System.out.println("합 종료.");
				continue;

			}
			if (select == 2) {
				cha();
				System.out.println("차이 종료.");
				continue;

			}
			if (select == 3) {
				mal();
				System.out.println("곱 종료.");
				continue;
			}
			if (select == 0) {
				System.out.println("프로그램 종료");
				break;

			}
		}
	}
}
