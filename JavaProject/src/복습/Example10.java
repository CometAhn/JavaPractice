package 복습;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int sum = 0; int count = 0; for (int i = 1; i <= 10; i++) { // 조건이 참일 때.
		 * 
		 * System.out.println(i + "번째 실행."); sum *= i; count++; } // for이 거짓일 때 빠져나옴.
		 * System.out.println("합 : " + sum); System.out.println("카운트 : " + count);
		 */

		// 0 ~ 100까지의 숫자 중 홀수의 합을 구하고자 한다.
		/*
		 * int i = 1; int sum = 0; for (i = 1; i <= 100; i++) { if (i % 2 == 1) { sum +=
		 * i; }
		 * 
		 * } System.out.println("홀수 값의 합 : " + sum);
		 */

		// for문을 이용하여 min부터 max까지 입력받은 수 만큼의 합을 구하고자 한다.
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.print("범위의 최소 값을 입력하세요. : "); int min = input.nextInt();
		 * System.out.print("범위의 최대 값을 입력하세요. : "); int max = input.nextInt();
		 * 
		 * int sum = 0;
		 * 
		 * for (int i = min; i <= max; i++) { if (i % 2 == 1) { sum += i; } }
		 * 
		 * System.out.printf("%d~%d 사이의 모든 홀수 값의 합 : %d", min, max, sum);
		 */

		// for문을 이용 10명의 점수를 입력받아 10명의 총합과 평균값을 구하는 프로그램을 작성하시오.
		// 배열로 어떻게 하지?
		/*
		 * Scanner input = new Scanner(System.in); int sum = 0; int[] student = new
		 * int[10]; for (int i = 1; i <= student.length; i++) {
		 * 
		 * sum += student[i]; }
		 */

		Scanner input = new Scanner(System.in);

		int sum = 0;
		int aver = 0;
		int number = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d번 학생의 점수는? : ", i);
			int ans = input.nextInt();

			sum += ans;
			number++;
		}
		System.out.printf("10명의 점수 총합은 : %d\n", sum);
		System.out.printf("10명의 점수 평균은 : %.1f", (float) sum / number);

	}

}
