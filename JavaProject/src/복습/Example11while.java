package 복습;

import java.util.Scanner;

public class Example11while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while
		/*
		 * int i = 1; int sum = 0;
		 * 
		 * while (i <= 10) { sum += i; i++; } System.out.println(sum);
		 */

		// 학생의 점수를 입력받아서 총합과 평균을 구하고자 한다.
		//
		/*
		 * Scanner input = new Scanner(System.in); int score = 0; int total = 0; int
		 * count = 0;
		 * 
		 * while (score >= 0) { System.out.printf("학생의 점수를 입력하시오[종료 : 음수값 입력] : ");
		 * score = input.nextInt(); count++;
		 * 
		 * total += score; } System.out.printf("학생의 수 : %d명\n", count);
		 * System.out.printf("학생의 총합 : %d\n", total); System.out.printf("학생의 평균 : %.2f",
		 * (float) total / count);
		 */

		// do~ while
		/*
		 * Scanner input = new Scanner(System.in); int score = 0; int total = 0; int
		 * count = 0; do { System.out.printf("학생의 점수를 입력하시오[종료 : 음수값 입력] : "); score =
		 * input.nextInt(); count++; total += score;
		 * 
		 * if (score < 0) { --count; total -= score; break; }
		 * 
		 * } while (score >= 0);
		 * 
		 * System.out.printf("학생의 수 : %d명\n", count); System.out.printf("학생의 총합 : %d\n",
		 * total); System.out.printf("학생의 평균 : %.2f", (float) total / count);
		 */

		// 22-06-27 실습4.txt 문제입니다.
		// 자바 프로그래밍 과목을 수강하는 학생들의 시험 점수들을 받아들여 통과 점수(60점이상)
		// 을 받은 학생들의 수와 낙제 점수(60점 미만)을 받은 학생들의 수를 계산하여 출력하는 프로그램을 작성하라.
		// 수강 학생들의 수는 1명 이상이라고 가정한다.

		Scanner input = new Scanner(System.in);
		int pass = 0;
		int fail = 0;
		int ans = 0;

		System.out.printf("첫 번째 정수(종료하려면 음수)를 입력하세요 : ");
		ans = input.nextInt();

		while (ans >= 0) {
			if (ans >= 60) {
				pass++;
			} else if (ans >= 0) {
				fail++;
			}
			System.out.printf("다음 정수(종료하려면 음수)를 입력하세요 : ");
			ans = input.nextInt();

		}
		if (pass == 0 && fail == 0) {
			System.out.printf("\n값이 없습니다.\n");

		} else {
			System.out.printf("\n총 학생 수 : %d\n", pass + fail);
			System.out.printf("통과 학생 수 : %d\n", pass);
			System.out.printf("낙제 학생 수 : %d\n", fail);
		}
	}

}
