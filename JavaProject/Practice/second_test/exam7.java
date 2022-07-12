package second_test;

class obj2 {
	int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
}

public class exam7 {
	public static void main(String[] args) {
		obj2 a = new obj2();
		System.out.println(a.subtract(100, 200));
	}
}

//메서드 : subtract
//클래스 속성 : int a, int b, result
//인스턴스 : obj a
