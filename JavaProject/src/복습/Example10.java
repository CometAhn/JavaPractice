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
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}

		}
		// System.out.println("홀수 값의 합 : " + i);

		// for문을 이용하여 1부터 입력받은 수 만큼의 합을 구하고자 한다.
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		sum = 0;
		for (i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				sum += i;
			}

		}
		System.out.println("홀수 값의 합 : " + i);

	}

}
