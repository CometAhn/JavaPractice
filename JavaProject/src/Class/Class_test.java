package Class;

import java.util.Scanner;

class func4 {

	static boolean endpro = true;

	static int sum(int a, int b) {
		return a * b;
	}

	static int sum(int a, int b, int c) {
		return a * b * c;
	}

	static void play() {

		System.out.print("구하고자 하는 식을 선택하세요. 사각형 면적(1), 사각형 기둥부피(2), 종료(0)");
	}
}

public class Class_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구하고자 하는 식을 선택하세요. 사각형 면적(1), 사각형 기둥부피(2), 종료(0)
		// 1.
		// 사각형의 면적 구하기
		// 가로의 길이 :
		// 세로의길이 :
		// 사각형의 넓이는 00 입니다.

		// 구하고자 하는 식을 선택하세요. 사각형 면적(1), 사각형 기둥부피(2), 종료(0)
		// 2.
		// 사각형 기둥의면적 구하기
		// 가로의 길이 :
		// 세로의길이 :
		// 기둥의 높이 :
		// 사각형 기둥의 부피는 00 입니다.

		// 구하고자 하는 식을 선택하세요. 사각형 면적(1), 사각형 기둥부피(2), 종료(0)
		// 0.
		// 프로그램을 종료합니다.

		Scanner input = new Scanner(System.in);

		while (func4.endpro) {
			func4.play();

			String num = input.next();

			if (num.equals("1")) {
				System.out.print("가로의 길이 : ");
				int we = input.nextInt();
				System.out.print("세로의 길이 : ");
				int he = input.nextInt();
				System.out.printf("사각형의 넓이는 %d 입니다.\n\n", func4.sum(we, he));

				continue;

			} else if (num.equals("2")) {

				System.out.print("가로의 길이 : ");
				int we = input.nextInt();
				System.out.print("세로의 길이 : ");
				int he = input.nextInt();
				System.out.print("기둥의 높이 : ");
				int cir = input.nextInt();
				System.out.printf("사각형 기둥의 부피는 %d 입니다.\n\n", func4.sum(we, he, cir));

				continue;
			} else if (num.equals("0")) {
				System.out.print("프로그램을 종료합니다.");
				break;

			}

		}
	}

}
