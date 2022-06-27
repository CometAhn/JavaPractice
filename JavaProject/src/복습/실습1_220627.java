
package 복습;

import java.util.Scanner;

public class 실습1_220627 {

	public static void main(String[] args) {
		// 22-06-27 실습1.txt 내용입니다.

		// IF 문
		// 회사의 입사지원 대상자 여부를 지원자의 평점과 TOEIC 점수에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
		// - 평점이 4.0 이상이고 TOEIC 점수가 700점 이상이면 '면접 대상자입니다'를 출력한다.
		// - 평점이 3.5 이상이고 4.0 미만이면서 TOEIC 점수가 700점 이상이면 '서류 전형 대상자 입니다'를 출력한다.
		// - 평점이 3.0 이상이고 3.5 미만이면서 TOEIC 점수가 700점 이상이면 '필기 시험 대상자입니다'를 출력한다.
		// - 평점이 3.0 미만이거나 TOEIC 점수가 700점 미만이면 '지원할 수 없습니다'를 출력한다.
		// 입사 지원 대상자의 평점과 TOEIC 점수는 키보드로 부터 입력 받아야 한다.
		//
		// 실행 예시
		// 평점을 입력하세요: 3.8
		// TOEIC 점수를 입력하세요: 780
		// 서류 전형 대상자 입니다.
		//

		double grade = 0;
		int toeic = 0;

		Scanner input = new Scanner(System.in);
		System.out.printf("평점을 입력하세요 : ");
		grade = input.nextDouble();
		System.out.printf("TOEIC점수를 입력하세요 : ");
		toeic = input.nextInt();

		if (grade >= 4.0 && toeic >= 700) {
			System.out.println("면접 대상자입니다.");
		} else if (grade >= 3.5 /* && grade < 4 */ && toeic >= 700) {
			System.out.println("서류 전형 대상자입니다.");
		} else if (grade >= 3.0 /* && grade < 3.5 */ && toeic >= 700) {
			System.out.println("필기 시험 대상자입니다.");
		} else /* if (grade < 3.0 || toeic < 700) */ {
			System.out.println("지원할 수 없습니다.");
		}
	}

}
