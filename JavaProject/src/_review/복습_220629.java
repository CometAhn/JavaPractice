package _review;

import java.util.Arrays;
import java.util.Scanner;

public class 복습_220629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner binput = new Scanner(System.in); int bsum = 0; int bscore = 0; int
		 * bnumber = 0; int[] bstudent = new int[10];
		 * 
		 * for (int i = 0; i < bstudent.length; i++) {
		 * 
		 * System.out.printf("%d번 학생의 점수는? : ", i + 1); int bans = binput.nextInt();
		 * bstudent[i] = bans; bsum += bstudent[i]; bnumber++; }
		 * System.out.printf("10명의 점수 총합은 : %d\n", bsum);
		 * System.out.printf("10명의 점수 평균은 : %.1f", (float) bsum / bnumber);
		 */
		/*
		 * int[] a = new int[5]; int[] b = new int[5];
		 * 
		 * a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5; b = a; a[0] = 5;
		 * System.out.print(b[0]);
		 */

		// int[] a = new int[] { 18, 20, 4, 25, 18 };

		/*
		 * for (int i = 0; i < a.length; i++) { a[i] = i; }
		 */
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i]);
		// }

		// System.out.println();

		// for (int i = 4; i >= 0; i--) {
		// System.out.print(a[i]);
		// }
		// System.out.print(Arrays.toString(a));

		/*
		 * int[] c = new int[10]; double avg = 0; for (int j = 0; j < c.length; j++) {
		 * c[j] = j; } // System.out.println(Arrays.toString(c)); // 문자열 형태로 가져온다.
		 */
		/*
		 * int[] student = { 100, 95, 90, 88, 93 }; int sum = 0; for (int i = 0; i <
		 * student.length; i++) { sum += student[i]; } avg = (double) sum /
		 * student.length; // System.out.println(avg);
		 * 
		 * Scanner input = new Scanner(System.in);
		 */
		/*
		 * int[] score = new int[5]; sum = 0; System.out.println("5학생의 점수를 입력하세요.\n");
		 * 
		 * for (int i = 0; i < score.length; i++) {
		 * 
		 * System.out.printf("%d번째 학생의의 점수를 입력하세요 :", i + 1);
		 * 
		 * score[i] = input.nextInt();
		 * 
		 * sum += score[i];
		 * 
		 * } System.out.printf("총 학생의 점수는 %d점, 평균 %.2f점 입니다.", sum, (float) sum /
		 * score.length);
		 */
		/*
		 * char[] arr = new char[5]; for (int i = 0; i < arr.length; i++) {
		 * 
		 * System.out.printf("%d번째 문자를 입력하세요 :", i + 1);
		 * 
		 * arr[i] = input.next().charAt(0);
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 */

		// 아래의 학생들의 점수를 입력 받아 평균을 구하고
		// 각 점수가 평균이상인지 혹은 평균보다 작은지를 출력하는 프로그램.

		// 출력
		// 10명의 학생들의 점수를 입력하세요 : 89 65 47 92 84 70 76 98 85 51
		// 평균 = 75.7
		// 점수 ..은 평균이상이다.
		// 점수 ..은 평균보다 작다.

		// 가장 높은 점수 :98
		// 가장 낮은 점수 : 47
		/*
		 * int[] score = new int[10]; int sum = 0; int min = 100; int max = 0; Scanner
		 * input = new Scanner(System.in);
		 * 
		 * System.out.printf("10명의 학생들의 점수를 입력하세요 : ");
		 * 
		 * for (int i = 0; i < score.length; i++) {
		 * 
		 * score[i] = input.nextInt(); if (max < score[i]) { max = score[i]; } if (min >
		 * score[i]) { min = score[i]; } sum += score[i];
		 * 
		 * }
		 * 
		 * float avg = (float) sum / score.length; System.out.printf("합계 : %d\n", sum);
		 * System.out.printf("평균 : %.1f\n", avg);
		 * 
		 * 
		 * for (int i = 0; i < score.length; i++) {
		 * 
		 * 
		 * if (score[i] > avg) { System.out.printf("점수 %s는 평균보다 크다.\n", score[i]); }
		 * else if (score[i] == avg) { System.out.printf("점수 %s는 평균과 같다.\n", score[i]);
		 * } else if (score[i] < avg) { System.out.printf("점수 %s는 평균보다 작다.\n",
		 * score[i]); }
		 * 
		 * 
		 * }
		 * 
		 * System.out.printf("가장 높은 점수 %s\n", max); System.out.printf("가장 낮은 점수 %s\n",
		 * min);
		 */

		Scanner scan = new Scanner(System.in);

		int[] a = { 51, 25, 39, 68, 12 };
		int[] asc = a.clone();
		int[] desc = a.clone();
		int tmp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (asc[i] > asc[j]) {
					tmp = asc[i];
					asc[i] = asc[j];
					asc[j] = tmp;
				}
				if (desc[i] < desc[j]) {
					tmp = desc[i];
					desc[i] = desc[j];
					desc[j] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(asc));
		System.out.println(Arrays.toString(desc));
		/*
		 * for (int i = 0; i < a.length - 1; i++) { for (int j = i + 1; j < a.length;
		 * j++) { if (a[i] < a[j]) {
		 * 
		 * tmp = a[i]; a[i] = a[j]; a[j] = tmp; } } }
		 * 
		 * System.out.println(Arrays.toString(a));
		 */

		String value = "12o34";
		char[] c = new char[5];
		boolean isnumber;

		for (int i = 0; i < value.length(); i++) {

			c[i] = value.charAt(i);
			if (c[i] >= '0' && c[i] <= '9') {
				isnumber = true;
				System.out.println(i + 1 + "번째 문자" + (char) c[i] + "는 숫자");
			} else {
				isnumber = false;
				System.out.println(i + 1 + "번째 문자" + (char) c[i] + "는 문자");
			}

		}

		System.out.println(Arrays.toString(c));

	}

}
