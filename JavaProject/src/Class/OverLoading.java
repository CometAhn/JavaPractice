package Class;

class Overloading1 {
	int sum(int a, int b) {
		System.out.println("인자가 둘일 경우 호출됨");
		return a + b;
	}

	int sum(int a, int b, int c) {
		System.out.println("인자가 셋일 경우 호출됨");
		return a + b + c;
	}

	double sum(double a, double b, double c) {
		System.out.println("double 타입일 경우 호출됨");
		return a + b + c;
	}

}

public class OverLoading {

	static int sum(int a, int b) {
		System.out.println("인자가 둘일 경우 호출됨");
		return a + b;
	}

	static int sum(int a, int b, int c) {
		System.out.println("인자가 셋일 경우 호출됨");
		return a + b + c;
	}

	static double sum(double a, double b, double c) {
		System.out.println("double 타입일 경우 호출됨");
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading1 overload = new Overloading1();

		System.out.println(overload.sum(3, 2));
		System.out.println(overload.sum(2, 3, 4));
		System.out.println(overload.sum(2.5, 3.5, 4.5));

		System.out.println(sum(3, 2));
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(2.5, 3.5, 4.5));

	}

}
