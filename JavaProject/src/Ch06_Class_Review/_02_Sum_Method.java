package Ch06_Class_Review;

import java.util.Scanner;

class sum {

	public void sum() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println(a + " + " + b + " = " + sum);
	}
}

public class _02_Sum_Method {

	public static void main(String[] args) {
		sum a = new sum();
		a.sum();
	}

}
