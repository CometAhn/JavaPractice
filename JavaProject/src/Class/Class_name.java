package Class;

class Check {
	static int cv = 5; // 클래스 변수
	int iv = 4; // 인스턴스 변수

	static void cm() {// 클래스 메소드

	}

	void im() {// 인스턴스 메소드

	}

	static void cm_Imember() {// 클래스 메소드
		// System.out.println(iv); // 클래스 멤버의 인스턴스 변수 사용 불가능
		// System.out.println(cv); // 클래스 멤버의 클래스 변수 사용 가능
	}

	static void cm_Cmember() {// 클래스 메소드
		System.out.println(cv); // 클래스 멤버의 클래스 변수 사용 가능
	}

	void im_Cmember() {// 인스턴스 메소드
		System.out.println(cv); // 인스턴스 멤버의 클래스 변수 사용 가능
	}

	void im_Imember() {// 인스턴스 메소드
		System.out.println(iv); // 인스턴스 멤버의 인스턴스 변수 사용 가능
	}
}

public class Class_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check.cm_Imember(); // 에러 사용 불가능
		Check.cm_Cmember(); // 사용가능

		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.im_Imember();

	}

}
