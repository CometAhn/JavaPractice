package 복습;

public class 복습220608 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			// System.out.println("i는" + i + "입니다.");
			if (i == 2) {
				// break; // i 값이 2가되면 반복문에서 강제 빠져나가라.

				i++;
				continue; // i 값이 2가되면 3인 상태로 처음으로 돌아간다
			}
			i++;
		}
		// System.out.println("프로그램 종료 부분");

		// 문제 1. 1~ 10까지 출력하는 while문장 작성.
		// 3의 배수는 출력하지 않는다.
		int a = 1; // a 값 정의.
					// 조건문에 들어가기 전에 1을 출력할 거라 1로 적어둠.

		System.out.printf("3의 배수를 제외한 1 ~ 10의 숫자 :\n%d", a); // 1 출력.

		while (a < 10) {
			a++; // a값 +1.
			if (a % 3 != 0) {
				System.out.printf(", %d", a); // , 2, 4, 5, 7, 8, 10 출력.
			}
		}
		System.out.print("."); // 그냥 마지막 점 출력.

		//////////////////////////////////
		// Run
		// 3의 배수를 제외한 1 ~ 10의 숫자 :
		// 1, 2, 4, 5, 7, 8, 10.
		//////////////////////////////////
	}

}
