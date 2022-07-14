package _review;

public class _20220714_Throw {

	public static void a() throws ArithmeticException {
		System.out.println("a실행");
		b();
	}

	public static void b() throws ArithmeticException {

		System.out.println("b실행");
		int num = 3 / 0;
	}

	public static void main(String[] args) {
		try {
			a();
		} catch (ArithmeticException e) {
			e.printStackTrace();

		}
	}

}
