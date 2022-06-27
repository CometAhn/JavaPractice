public class Variables2 {

	int a; // a는 기본형 변수이면서 멤버 변수의 인스턴스 변수
	static String b; // b는 참조 변수이면서 멤버 변수의 클래스 변수

	void m(int c) {// c는 기본형 변수이면서 매개 변수이면서 지역 변수
		int d = c;// d는 기본형 변수이면서 지역 변수
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e = 0; // e는 기본형이면서 지역 변수
		Variables2 v = new Variables2(); // v는 참조변수이면서 지역변수
		v.m(e); // e는 인자값으로 값이 0이 매개 변수에 복사 되어넣어진다.

		int num; // 변수 선언
		num = 20; // 변수의 초기화
		System.out.println(num);

		// 변수의 삽입 -> 초기화 과정에서
		// 초기화를 하지 않으면 변수를 쓸 수 없다.
		// 정수를 저장하기 위한 메모리 공간을 할당 받으면
		// 반드시 해당 타입의 데이터만을 저장해야 한다.
		// 만약 다른 타입의 데이터를 저장하려고 하면
		// 자바 컴파일러는 오류를 발생 시킨다.

		int num1, num2; // 같은 타입의 변수 여러개를 동시에 선언 할 수 있음
		double num3 = 3.14;// 선언과 ㅗㅇ시에 초기화
		double num4 = 1.23, num5 = 4.56;// 같은 타입의 변수를 동시에 선언과 초기화
		// 선언하고자 하는 변수의 타입이 다른 경우에는 동시에 선언 할 수 없다.
		// ex) int num1, double num2;은 불가능하다.

		// 변수의 초기화를 동시에 하려면
		double num6, num7;
		// num6 = 1,23, num7 = 2.34; // 이미 선언이 되어 있는 상태에서는 동시에 초기화는 할 수 없다.

	}

}