package Ch06_Class;

class function1 {
	int hap1(int a, int b) {
		int c = a + b;
		return c; // return이 있다면 반환타입은 void x
	} // 두 개의 값을 받아서 c를 리턴한다.

}

class function2 {
	void hap2(int a, int b) {
		int c = a + b;
		System.out.println("f2의 메서드의 결과 : " + c);
	} // return이 없다면 반환타입은 void o
} // 두 개의 합을 받아서 출력한다.

class function3 {
	static void hap3() {
		System.out.println("---------- 구분선 ----------");
	}
}

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val1 = 10;
		int val2 = 20;
		int valhap = 0;

		function1 f1 = new function1();
		function2 f2 = new function2();

		valhap = f1.hap1(val1, val2);
		System.out.println("f1의 메서드의 결과 : " + valhap);

		f2.hap2(val1, val2);
		function3.hap3();

	}

}
