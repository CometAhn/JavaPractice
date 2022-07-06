package review;

import java.util.Scanner;

public class While {

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

		/*
		 * Scanner input = new Scanner(System.in); int pass = 0; int fail = 0; int ans =
		 * 0;
		 * 
		 * System.out.printf("첫 번째 정수(종료하려면 음수)를 입력하세요 : "); ans = input.nextInt();
		 * 
		 * while (ans >= 0) { if (ans >= 60) { pass++; } else if (ans >= 0) { fail++; }
		 * System.out.printf("다음 정수(종료하려면 음수)를 입력하세요 : "); ans = input.nextInt();
		 * 
		 * } if (pass == 0 && fail == 0) { System.out.printf("\n값이 없습니다.");
		 * 
		 * } else { System.out.printf("\n총 학생 수 : %d\n", pass + fail);
		 * System.out.printf("통과 학생 수 : %d\n", pass);
		 * System.out.printf("낙제 학생 수 : %d\n", fail); }
		 */

		// 22-06-27 실습5.txt 문제입니다.
		// 22-06-27 실습5 - 코드 골격.txt의 틀을 사용합니다.
		// 한 대학생이 방학중에 유럽으로 배낭 여행을 가려고 한다.
		// 유럽에서는 우리나라와 달리 화씨 온도를 사용하고 있다. 여행시 날씨에 적합한 옷들을 준비하기 위해 방문하는 도시들의 평균 온도가 섭씨로
		// 얼마인지 알고 싶다.
		// 먼저 방문하는 도시 이름을 입력하고 화씨로 된 평균 온도를 입력하면 대응되는 섭씨 온도를 계산해서 출력해야 한다.
		// 다음으로 계속하기를 원하는지를 물어보고 계속하겠다면 같은 일을 반복한다.
		// 그렇지 않다면 종료한다. do~while 문을 사용하라.
		// 화씨 -> 섭씨 5.0/9.0 * (섭씨 -32.0);

		// 출력
		// 방문할 도시 이름을 입력하세요 : 북경
		// 방문 도시의 화씨 온도를 입력하세요 : 92
		// 대응하는 섭씨 온도 값: 33.3333333336
		// 계속하기를 원하세요? 그렇다면 y를 아니면 n를 입력하세요: y
		// 방문할 도시 이름을 입력하세요 : 파리
		// 방문 도시의 화씨 온도를 입력하세요 : 85
		// 대응하는 섭씨 온다 값: 29.4444444446
		// 계속하기를 원하세요? 그렇다면 y를 아니면 n를 입력하세요: n

		String city;
		int Fahrenheitvalue;
		double Celsiusvalue;
		String flag;

		Scanner input = new Scanner(System.in);
		do {
			System.out.print("방문할 도시 이름을 입력하세요. : ");
			city = input.next();

			System.out.printf("방문 도시의 화씨 온도를 입력하세요. : ");
			Fahrenheitvalue = input.nextInt();

			Celsiusvalue = (double) (5.0 / 9.0 * (Fahrenheitvalue - 32.0));
			System.out.printf("대응하는 섭씨 온도 값 : %f\n\n", Celsiusvalue);
			System.out.printf("계속하기를 원하세요? 그렇다면 y를, 아니라면 n를 입력하세요. :");
			flag = input.next();

		} while (flag.equals("Y") || flag.equals("y"));

	}

}
