
package 복습;

import java.util.Scanner;

public class 실습_220627 {

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

		/*
		 * double grade = 0; int toeic = 0;
		 * 
		 * Scanner input = new Scanner(System.in); System.out.printf("평점을 입력하세요 : ");
		 * grade = input.nextDouble(); System.out.printf("TOEIC점수를 입력하세요 : "); toeic =
		 * input.nextInt();
		 * 
		 * // 방법1 if (grade >= 4.0 && toeic >= 700) { System.out.println("면접 대상자입니다.");
		 * } else if (grade >= 3.5 && toeic >= 700) {
		 * System.out.println("서류 전형 대상자입니다."); } else if (grade >= 3.0 && toeic >= 700)
		 * { System.out.println("필기 시험 대상자입니다."); } else {
		 * System.out.println("지원할 수 없습니다."); }
		 * 
		 * // 방법2 if (toeic >= 700) { if (grade >= 4.0) {
		 * System.out.println("면접 대상자입니다."); } else if (grade >= 3.5) {
		 * System.out.println("서류 전형 대상자입니다."); } else if (grade >= 3.0) {
		 * System.out.println("필기 시험 대상자입니다."); } else
		 * System.out.println("지원할 수 없습니다."); } else System.out.println("지원할 수 없습니다.");
		 */

		// 22-06-27 실습2.txt 내용입니다.
		// 한 대학생의 총 이수학점과 TOEIC 점수를 입력 받아 졸업 혹은 수료 여부를 알려주는 프로그램을 작성하라.
		// 대학의 졸업 요건은 다음과 같다.
		// 총 이수학점이 140이상이고 TOEIC 점수가 700이상이면 졸업한다.
		// 총 이수학점이 140이상이고 TOEIC 점수가 700 미만이면 졸업하지 못하고 수료한다.
		// 총 이수학점이 140미만이면 졸업도 안되고 수료도 안된다.

		// 이 프로그램은 '총 이수학점을 입력하세요. :' 라는 메세지를 출력한 후 총 이수학점을 입력받아야 한다.
		// 다음으로 'TOEIC 점수를 입력하세요. :' 라는 메세지를 출력한 후 TOEIC점수를 입력 받아야한다.
		// 다음으로 졸업하는 경우에는 '졸업을 축하합니다.'를 출력하고, 수료하는 경우에는 '아쉽지만 수료하셨습니다.'를 출력하고 졸업도 안되고
		// 수료도 안되는 경우에는 '졸업이 불가능 합니다.'를 출력해야한다.

		// 예시
		// 이수학점을 입력하세요. : 142
		// TOEIC 점수를 입력하세요. : 750
		// 졸업을 축하합니다.
		/*
		 * int grade = 0; int toeic = 0; Scanner input = new Scanner(System.in);
		 * 
		 * System.out.printf("이수학점을 입력하세요. : "); grade = input.nextInt();
		 * System.out.printf("TOEIC점수를 입력하세요. : "); toeic = input.nextInt();
		 * 
		 * if (grade >= 140) { if (toeic >= 700) System.out.printf("졸업을 축하합니다."); else
		 * if (toeic < 700) System.out.printf("아쉽지만 수료하셨습니다.");
		 * 
		 * } else System.out.printf("졸업이 불가능합니다.");
		 */

		// 22-06-27 실습3.txt 내용입니다.
		// 한 대학생이 이번 학기에 프로그래밍 과목을 수강하고 있다.
		// 이 과목의 성적 평가 요소는 출석, 과제, 수시 시험, 중간시험과 기말시험이다.
		// 각 평가 요소의 반영률은 출석 10%, 과제 40%, 수시시험 10%, 중간시험 20%, 기말시험 20%이다.
		// 이 과목의 학점은 다음 기준에 의해 주어진다.

		// 총점90~100, A학점
		// 총점80~89, B학점
		// 총점70~79, C학점
		// 총점60~69, D학점
		// 총점0~59, F학점

		// 이 학생의 각 평가 요소의 점수를 입력 받아 총점을 계산하고 학점을 부여하는 프로그램을 작성하라.

		// 출력
		// 출석 점수를 입력하세요. : 94
		// 과제 점수를 입력하세요. : 88
		// 수시시험 점수를 입력하세요. : 82
		// 중간시험 점수를 입력하세요. : 75
		// 기말시험 점수를 입력하세요. : 98
		// 총점 : 87.4
		// 학점 : B

		int check;
		int hw;
		int test;
		int ft;
		int st;
		char grade;
		Scanner input = new Scanner(System.in);

		System.out.printf("출석 점수를 입력하세요. : \t");
		check = input.nextInt();
		System.out.printf("과제 점수를 입력하세요. : \t");
		hw = input.nextInt();
		System.out.printf("수시시험 점수를 입력하세요. : \t");
		test = input.nextInt();
		System.out.printf("중간고사 점수를 입력하세요. : \t");
		ft = input.nextInt();
		System.out.printf("기말시험 점수를 입력하세요. : \t");
		st = input.nextInt();

		double totalscore = check * 0.1 + hw * 0.4 + test * 0.1 + ft * 0.2 + st * 0.2;

		if (totalscore >= 90) {
			grade = 'A';
		} else if (totalscore >= 80) {
			grade = 'B';
		} else if (totalscore >= 70) {
			grade = 'C';
		} else if (totalscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("총점 : %.1f\n", totalscore);
		System.out.printf("학점 : %s", grade);
	}

}
