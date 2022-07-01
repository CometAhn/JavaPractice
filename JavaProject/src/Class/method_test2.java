package Class;

import java.util.Scanner;

class func2 {

	static int c = 0;

	static int range(int a, int b) { // a~b까지 범위의 모든 숫자 출력 int
		for (int i = 0; i < b - a + 1; i++) {
			c += a + i;
			System.out.printf("%d ", c);
			c = 0;
		}
		return c;
	}

	static void range1(int a, int b) { // a~b까지 범위의 모든 숫자 출력 void
		for (int i = 0; i < b - a + 1; i++) {
			System.out.printf("%d ", a + i);
		}
	}

	static int area(int a, int b) { // 삼각형 넓이 구하기
		return (int) (a * b * 0.5);

	}

	float result;

	float area(int a, int b, int c) { // 사다리꼴 넓이 구하기
		result = (float) (a + b * c * 0.5);
		return result;
	}

}

public class method_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // 입력 받는 거

		// 특정 값들의 범위를 출력하는 프로그램을 작성하고자 한다.
		// 첫번째 인자(시작 값), 두번째 인자(끝 값)

		System.out.print("최소값 : ");
		int min = input.nextInt();
		System.out.print("최대값 : ");
		int max = input.nextInt();
		func2.range(min, max);

		// 삼각형의 넓이를 구하는 프로그램 작성
		// 삼각형의 넓이 : 1/2*밑변길이*높이:class로 구현
		// 입력
		// 밑변 길이. 높이

		System.out.print("\n\n밑변 : ");
		int we = input.nextInt();
		System.out.print("높이 : ");
		int he = input.nextInt();

		float output = func2.area(we, he);
		System.out.printf("밑변  : %d, 높이 : %d, 넓이 : %.1f", we, he, output);

		// 사다리꼴의 넓이를 구하는 프로그램 작성
		// 사다리꼴의 넓이 : (윗변 + 아랫변) * 높이 / 2
		// 출력 윗변, 아랫변, 높이

		func2 func22 = new func2();
		System.out.print("\n\n밑변 : ");
		int bot = input.nextInt();
		System.out.print("윗변 : ");
		int top = input.nextInt();
		System.out.print("높이 : ");
		int he1 = input.nextInt();

		float output1 = func22.area(bot, top, he1);
		System.out.printf("밑변  : %d, 윗변 : %d, 높이 : %d, 넓이 : %.1f", bot, top, he1, output1);

	}

}
