package Class;

import java.util.Scanner;

class func2 {

	static void range(int a, int b) {
		for (int i = 0; i < b - a + 1; i++) {
			System.out.printf("%d ", (a + i));
		}
	}
}

public class method_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 특정 값들의 범위를 출력하는 프로그램을 작성하고자 한다.
		// 첫번째 인자(시작 값), 두번째 인자(끝 값)
		Scanner input = new Scanner(System.in);

		System.out.print("최소값 : ");
		int min = input.nextInt();
		System.out.print("최대값 : ");
		int max = input.nextInt();

		func2.range(min, max);

	}

}
