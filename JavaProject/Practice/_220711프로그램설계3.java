import java.util.Scanner;

public class _220711프로그램설계3 {

	public static void main(String[] args) {

//		문제1. 직원의 연봉과 근무평가등급을 입력 받아 연봉 인상금액과 새 연봉을 계산하여 출력하는 프로그램을 설계하고 작성하라. 직원의 근무평가등급은 우수, 보통과 불량 중 하나이다.
//		1(우수) 등급을 받은 직원은 연봉이 6% 인상되고 2(보통) 등급을 받은 직원은 연봉이 4% 인상되며 3(불량) 등급을 받은 직원은 연봉이 2% 인상된다. 다음은 프로그램의 모범 출력이다.
//
//		출력
//		현 연봉을 입력하세요 : 2400
//		근무 평가등급을 입력하세요 : 1
//		연봉 인상액 : 144.0
//		새 연봉 : 2544.0
//		변수
		// pay, grade, increase
//		알고리즘

		Scanner sc = new Scanner(System.in);
		System.out.print("현 연봉을 입력하세요. : ");
		int pay = sc.nextInt();
		System.out.print("근무 평가 등급을 입력하세요. : ");
		int grade = sc.nextInt();
		float increase = 0;

		if (grade == 1) {
			increase = (float) (pay * 0.06);
		} else if (grade == 2) {
			increase = (float) (pay * 0.04);
		} else if (grade == 3) {
			increase = (float) (pay * 0.02);
		}
		System.out.println("연봉 인상액 : " + increase);
		System.out.println("새 연봉 : " + (increase + pay));

	}

}
