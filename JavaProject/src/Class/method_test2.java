package Class;

import java.util.Scanner;

class func2 {

	static void range(int a, int b) {
		for (int i = 0; i < b - a + 1; i++) {
			System.out.printf("%d ", (a + i));
		}
	}
}

class func3 {

	static void area(int a, int b) {
		System.out.printf("밑변  : %d, 길이 : %d, 높이 : %.0f", a, b, (a * b * 0.5));

	}
}

class func4 {

	static void area(int a, int b, int c) {
		System.out.printf("윗변  : %d, 아랫변 : %d, 높이 : %d, 넓이 : %d", a, b, c, ((a + b) * c / 2));

	}
}

public class method_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // 입력 받는 거

		// 특정 값들의 범위를 출력하는 프로그램을 작성하고자 한다.
		// 첫번째 인자(시작 값), 두번째 인자(끝 값)

		/*
		 * System.out.print("최소값 : "); int min = input.nextInt();
		 * System.out.print("최대값 : "); int max = input.nextInt(); func2.range(min, max);
		 */

		// 삼각형의 넓이를 구하는 프로그램 작성
		// 삼각형의 넓이 : 1/2*밑변길이*높이:class로 구현
		// 입력
		// 밑변 길이. 높이

		/*
		 * System.out.print("밑변 : "); int we = input.nextInt();
		 * System.out.print("높이 : "); int he = input.nextInt();
		 * 
		 * func3.area(we, he);
		 */

		// 사다리꼴의 넓이를 구하는 프로그램 작성
		// 사다리꼴의 넓이 : (윗변 + 아랫변) * 높이 / 2
		// 출력 윗변, 아랫변, 높이

		System.out.print("밑변 : ");
		int bot = input.nextInt();
		System.out.print("윗변 : ");
		int top = input.nextInt();
		System.out.print("높이 : ");
		int he = input.nextInt();

		func4.area(bot, top, he);

	}

}
