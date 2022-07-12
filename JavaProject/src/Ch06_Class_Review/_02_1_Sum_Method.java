package Ch06_Class_Review;

import java.util.Scanner;

public class _02_1_Sum_Method {
	public void sum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("a, b의 값을 입력 받아 두 값의 합을 구하고자 한다.");
		System.out.println("a의 값은?");
		int a = sc.nextInt();
		System.out.println("b의 값은?");
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println(a + " + " + b + " = " + sum);
	}
}
