package Ch06_Class_Review;

import java.util.Scanner;

public class _01_1_range {
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int sum = 0;
		System.out.println("범위를 입력하여 합을 구하는 프로그램");
		System.out.println("범위를 입력하세요.(start end) : ");

		start = sc.nextInt();
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "에서 " + end + "까지의 합은 : " + sum);
	}
}
