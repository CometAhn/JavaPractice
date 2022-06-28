package 복습;

import java.util.Scanner;

public class 실습_220628 {

	public static void main(String[] args) {

		// 22-06-28 실습1.txt 내용입니다.
		// 원의 면적을 계산하는 프로그램 작성하기.
		// 상수 PI = 3.14159 원주율
		// 변수 radius; 반지름
		// area; 면적
		// 면적 계산
		// 면적 = 원주율 * 반지름 * 반지름
		// 출력
		// 원의 반지름을 입력하세요 : 12.5
		// 원의 반지름은 12.5이다.
		// 원의 면접은 490.8734374999999997

		double PI = 3.14159; // 원주율
		double radius = 0; // 반지름
		double area; // 면적

		Scanner input1 = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		radius = input1.nextDouble();
		System.out.printf("원의 반지름은 %.1f이다.\n", radius);

		area = PI * radius * radius;
		System.out.printf("원의 면적은 %s\n", area);

		int i = 3;
		int x = 4;
		int y = 4;
		x = ++i * x;
		y = i++ * y;

		System.out.printf("원의 면적은 %s\n", x);
		System.out.printf("원의 면적은 %s\n", y);

	}

}
