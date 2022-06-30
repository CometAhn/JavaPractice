class obj {
	static int a = 100;
	int b = 200;
}

public class exam1 {
	public static void main(String[] args) {
		/*
		 * 코드를 완성하시오. 출력까지 되어야 완성입니다. 두개의 변수의 접근방법은 서로 달라야 합니다.
		 */

		int b;
		obj out = new obj();
		System.out.println(out.a);
		System.out.println(out.b);

	}
}
