package Ch06_Class_Review;

import java.util.Scanner;

public class _02_1_Sum_Method {

	int a = 0;
	int b = 0;

	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값은?");
		a = sc.nextInt();
		System.out.println("b의 값은?");
		b = sc.nextInt();
	}

	public void sum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("a, b 두 값을 입력 받아 합을 구하고자 한다.");

		scan();

		int sum = a + b;

		System.out.println(a + " + " + b + " = " + sum);
	}

	public void cha() {

		System.out.println("a, b 두 값을 입력 받아 차를 구하고자 한다.");

		scan();

		int cha = a - b;

		System.out.println(a + "와 " + b + "의 차는 " + Math.abs(cha) + "이다.");
	}

	public void mal() {

		System.out.println("a, b 두 값을 입력 받아 곱를 구하고자 한다.");

		scan();

		int mal = a * b;

		System.out.println(a + " * " + b + " = " + mal);
	}
}
