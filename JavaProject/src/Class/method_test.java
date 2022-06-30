package Class;

import java.util.Scanner;

class func {

	static int calculator(int a, int b) {
		return a * b;
		// int area = a*b;
		// return area;
	}

}

public class method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("가로 : ");
		int we = input.nextInt();
		System.out.print("세로 : ");
		int hi = input.nextInt();

		int output = func.calculator(hi, we);

		System.out.printf("%d * %d의 넓이 : %d", we, hi, output);
	}

}
