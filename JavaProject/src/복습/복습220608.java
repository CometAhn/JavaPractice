package 복습;

public class 복습220608 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			// System.out.println("i는" + i + "입니다.");
			if (i == 2) {
				// break; // i 값이 2가되면 반복문에서 강제 빠져나가라.

				i++;
				continue; // i 값이 2가되면 처음으로 돌아간다 i(2)
			}
			i++;
		}
		// System.out.println("프로그램 종료 부분");

		// 문제 1. 1~ 10까지 출력하는 while문장 작성.
		// 3의 배수는 출력하지 않는다.
		int a = 1;

		System.out.printf("3의 배수를 제외한 1 ~ 10의 숫자 :\n%d", a);
		while (a < 10) {
			a++;
			if (a % 3 == 0) {
			} else {
				System.out.printf(", %d", a);
			}

		}
	}

}
