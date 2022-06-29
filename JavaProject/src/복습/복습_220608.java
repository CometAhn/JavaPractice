package 복습;

import java.util.Scanner;

public class 복습_220608 {

	public static void main(String[] args) throws InterruptedException {

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

		// 문제 1. 1 ~ 10까지 출력하는 while문장 작성.
		// 3의 배수는 출력하지 않는다.
		int a = 1; // a 값 정의.
					// 조건문에 들어가기 전에 1을 출력할 거라 1로 적어둠.

		// System.out.printf("3의 배수를 제외한 1 ~ 10의 숫자 :\n%d", a); // 1 출력.

		while (a < 10) {
			a++; // a값 +1.
			if (a % 3 != 0) {
				// System.out.printf(", %d", a); // , 2, 4, 5, 7, 8, 10 출력.
			}
		}
		// System.out.print("."); // 그냥 마지막 점 출력.

		//////////////////////////////////
		// Run
		// 3의 배수를 제외한 1 ~ 10의 숫자 :
		// 1, 2, 4, 5, 7, 8, 10.
		//////////////////////////////////

		// 문제 1-1. 1 ~ 10까지 출력하는 while문장 작성.
		// 3의 배수만 출력한다.
		int b = 3; // b 값 정의.
					// 조건문에 들어가기 전에 3을 출력할 거라 3으로 적어둠.

		// System.out.printf("1 ~ 10의 숫자 중 3의 배수 :\n%d", b); // 3 출력.

		while (b < 10) {
			b++; // b값 +1.
			if (b % 3 == 0) {
				// System.out.printf(", %d", b); // , 3, 6, 9 출력.
			}
		}
		// System.out.print("."); // 그냥 마지막 점 출력.

		//////////////////////////////////
		// Run
		// 1 ~ 10의 숫자 중 3의 배수 :
		// 3, 6, 9.
		//////////////////////////////////

		// 0 ~ 100 까지의 점수만 입력이 가능하게 설정
		Scanner input = new Scanner(System.in);
		int score = 0;

		// System.out.print("0 ~ 100사이의 값을 입력하세요 :");
		// score = input.nextInt();

		while (score < 0 || score > 100) {
			System.out.print("범위에서 벗어난시험 점수가 입력되었습니다.");
			System.out.print("시험 점수 (0과 00사이의 점수)를 입력하세요.");
			break;
		}

		// 문제 2. for, while, do ~ while문을 이용해서 1~10까지의 합 구하기.
		int sum = 0;
		for (int c = 1; c <= 10; c++) {
			sum += c;
		}
		// System.out.printf("1 ~ 10의 총합 : %d(for)\n", sum);

		sum = 0;
		int d = 1;
		while (d <= 10) {
			sum += d;
			d++;
		}
		// System.out.printf("1 ~ 10의 총합 : %d(while)\n", sum);

		sum = 0;
		int e = 1;
		do {
			sum += e;
			e++;

		} while (e <= 10);
		// System.out.printf("1 ~ 10의 총합 : %d(do ~ while)\n\n", sum);

		// 문제3. count down for, while, do ~ while
		int f = 0;
		for (f = 10; f >= 1; f--) {
			// System.out.printf("%d ", f);
			// Thread.sleep(1000);
		}
		// System.out.printf("%d(for)\n", f);
		// Thread.sleep(1000);

		int g = 10;
		while (g >= 1) {
			// System.out.printf("%d ", g);
			// Thread.sleep(1000);
			g--;
		}
		// System.out.printf("%d(while)\n", g);
		// Thread.sleep(1000);

		int h = 10;
		do {
			// System.out.printf("%d ", h);
			// Thread.sleep(1000);
			h--;
		} while (h >= 1);
		// System.out.printf("%d(do ~ while)\n", h);

		// 문제4. 1 ~ 10까지의 숫자 중 홀수의 합을 구하고자 한다.
		// if문 사용금지.
		int j = 0;
		int oddsum = 0;
		int evensum = 0;

		for (j = 0; j <= 10; j = j + 2) {
			evensum += j;
		}
		for (j = 1; j <= 10; j = j + 2) {
			oddsum += j;
		}
		// System.out.println("홀수의 총합 : " + oddsum + "(for)");
		// System.out.println("짝수의 총합 : " + evensum + "(for)");

		int k = 0;
		oddsum = 0;
		evensum = 0;

		while (k <= 10) {
			while (k % 2 == 0) {
				evensum += k;
				k++;
				continue;
			}
			while (k % 2 == 1) {
				oddsum += k;
				k++;
				continue;
			}
		}
		// System.out.println("홀수의 총합 : " + oddsum + "(while)");
		// System.out.println("짝수의 총합 : " + evensum + "(while)");

		int l = 0;
		oddsum = 0;
		evensum = 0;

		do {
			do {
				oddsum += l;
				l++;
				continue;
			} while (l % 2 == 1);
			do {
				evensum += l;
				l++;
				continue;
			} while (l % 2 == 0);

		} while (l <= 10);
		// System.out.println("홀수의 총합 : " + oddsum + "(do ~ while)");
		// System.out.println("짝수의 총합 : " + evensum + "(do ~ while)");

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
		// System.out.print("원의 반지름을 입력하세요 : ");
		// radius = input1.nextDouble();
		// System.out.printf("원의 반지름은 %.1f이다.\n", radius);

		area = PI * radius * radius;
		// System.out.printf("원의 면적은 %s\n", area);
		/*
		 * int max; int mid = 0; int min;
		 * 
		 * // System.out.print("세 개의 정수를 입력 하시오. : "); int aa = input.nextInt(); int bb
		 * = input.nextInt(); int cc = input.nextInt();
		 * 
		 * max = aa > bb ? aa > cc ? aa : cc : bb > cc ? bb : cc; min = aa < bb ? aa <
		 * cc ? aa : cc : bb < cc ? bb : cc;
		 * 
		 * // 귀찮지만 확실한 방법
		 * 
		 * if ((max == aa && min == bb) || (max == bb && min == aa)) { mid = cc; } else
		 * if ((max == aa && min == cc) || (max == cc && min == aa)) { mid = bb; } else
		 * if ((max == bb && min == cc) || (max == cc && min == bb)) { mid = aa; }
		 * 
		 * // a3 b2 c1 // a1 b2 c3
		 * 
		 * System.out.printf("세 숫자 중에서 가장 큰 수는 %d입니다.\n", max);
		 * System.out.printf("세 숫자 중에서 중간 수는 %d입니다.\n", mid);
		 * System.out.printf("세 숫자 중에서 가장 작은 수는 %d입니다.\n", min);
		 */
		// 평점을 입력하여 4.0 이상이면 '장학금대상자입니다'를 출력학 만들어 보시오
		// 출력
		// 평점을 입력하세요 : 4.2
		// 평점 : 4.2
		// 장학금대상자입니다.
		/*
		 * System.out.print("평점을 입력하세요 : "); float grade = input.nextFloat();
		 * 
		 * System.out.printf("평점 : %.1f\n", grade);
		 * 
		 * if (grade >= 4.0) { System.out.printf("장학금 대상자입니다.");
		 * 
		 * }
		 */

		// if - else문 이용
		// 시험 점수(testScore)와 면접 점수(interviewScore)을 입력 받아.
		// 시험 점수가 80점 이상이고 면접 점수가 60점 이상이면 "합격을 축하합니다."를 출력
		// 아니면 "아쉽지만 불합격입니다."출력

		/*
		 * int testScore = 0; int interviewScore = 0;
		 * 
		 * System.out.print("시험 점수는?"); testScore = input.nextInt();
		 * System.out.print("면접 점수는?"); interviewScore = input.nextInt();
		 * 
		 * if (testScore >= 80 && interviewScore >= 60) {
		 * System.out.print("합격을 축하합니다."); } else { System.out.print("아쉽지만 불합격입니다.");
		 * 
		 * }
		 */

		int num1 = 0;
		int num2 = 0;

		System.out.print("숫자 두 개를 입력해 주세요.");
		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 == num2) {
			System.out.printf("%d과(와) %d는 같은 숫자입니다.", num1, num2);

		} else if (num1 > num2) {
			System.out.printf("%d은(는) %d보다 %d큽니다.", num1, num2, num1 - num2);

		} else if (num1 < num2) {
			System.out.printf("%d은(는) %d보다 %d작습니다.", num2, num1, num2 - num1);

		}

	}

}
