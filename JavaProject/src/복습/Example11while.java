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
		Scanner input = new Scanner(System.in);
		int score = 0;
		int total = 0;
		int count = 0;

		while (true) {
			System.out.printf("더할 수 : ");
			int ans = input.nextInt();
			total += ans;
			count++;
			if (count == 10) {
				break;
			}
		}
		System.out.println("총 합 : " + total);

	}

}
