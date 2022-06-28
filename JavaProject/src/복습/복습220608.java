package 복습;

import java.util.Scanner;

public class 복습220608 {

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

		for (j = 1; j <= 10; j = j + 2) {
			oddsum += j;
		}
		for (j = 0; j <= 10; j = j + 2) {
			evensum += j;
		}
		System.out.println("홀수의 총합 : " + oddsum + "(for)");
		System.out.println("짝수의 총합 : " + evensum + "(for)");

		int k = 0;
		oddsum = 0;
		evensum = 0;

		while (k <= 10) {
			while (k % 2 == 1) {
				oddsum += k;
				k++;
				continue;
			}
			while (k % 2 == 0) {
				evensum += k;
				k++;
				continue;
			}
		}
		System.out.println("홀수의 총합 : " + oddsum + "(while)");
		System.out.println("짝수의 총합 : " + evensum + "(while)");

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
		System.out.println("홀수의 총합 : " + oddsum + "(do ~ while)");
		System.out.println("짝수의 총합 : " + evensum + "(do ~ while)");

	}

}
