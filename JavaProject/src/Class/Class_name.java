package Class;

class test {
	int test_a = 5;
	static int test_b = 10;

}

class Check {
	static int cv = 5; // 클래스 변수
	int iv = 4; // 인스턴스 변수

	static void cm() {// 클래스 메소드
	}

	void im() {// 인스턴스 메소드
	}

	static void cm_Imember() {// 클래스 메소드
		// System.out.println(iv); // (에러)클래스 메소드의 인스턴스 변수 사용 불가능
		// im(); // (에러)클래스 메소드의 인스턴스 멤버는 오류
	}

	static void cm_Cmember() {// 클래스 메소드
		System.out.println(cv); // 클래스 메소드의 클래스 변수 사용 가능
		cm(); // 클래스 메소드의 인스턴스 멤버는 사용 가능
	}

	void im_Cmember() {// 인스턴스 메소드
		System.out.println(cv); // 인스턴스 멤버의 클래스 변수 사용 가능
		cm();// 인스턴스 메소드의 클래스 멤버는 사용 가능
	}

	void im_Imember() {// 인스턴스 메소드
		System.out.println(iv); // 인스턴스 멤버의 인스턴스 변수 사용 가능
		im(); // 인스턴스 메소드의 인스턴스 멤버는 사용 가능
	}
}

public class Class_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Check.cm_Imember(); // 에러 사용 불가능 Check.cm_Cmember(); // 사용가능
		 * 
		 * Check myinstance = new Check(); myinstance.im_Cmember();
		 * myinstance.im_Imember();
		 */
		System.out.println(test.test_b);
		test t1 = new test(); // 인스턴스 변수는 인스턴스 객체 생성 후 사용 가능
		System.out.println(t1.test_a);

	}

}
