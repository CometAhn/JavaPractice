package 상속과다형성08;

class C {

	static class StaticInner {
	}

	class InstanceInner {

	}

	StaticInner st1 = new StaticInner(); // 스태틱 멤버간의 접근 가능
	InstanceInner ii1 = new InstanceInner(); // 인스턴스 멤버간의 접근 가능

	static void StaticMothod() {
		StaticInner st2 = new StaticInner();
		// InstanceInner ii3 = new InstanceInner(); // (error)스태틱 멤버는 인스턴스 멤버에 접근 불가.
	}

	void InstanceMoethod() {
		InstanceInner ii2 = new InstanceInner();
		StaticInner st3 = new StaticInner();// 인스턴스 멤버는 모두 접근 가능.

	}
}

class OuterClass {

	class InnerInstance {// 인스턴스 클래스 : 어떤 클래스에서든 호출이 가능

	}

	static class InnerStatic { // 스태틱 클래스 : 스태틱 내부 클래스 끼리만 호출이 가능

	}

	abstract class Innerinstnace1 { // 내부 클래스 접근성
		abstract void chat();
	}

	private class InnerInstance2 { // 내부 클래스 접근성

	}

	protected class InnerInstance3 { // 내부 클래스 접근성

	}

}

class OuterClass1 {
	int a = 3;
	static int b = 4;

	class Inner { // 인스턴스 클래스는 인스턴스 변수만 가능.
		int c = 5;

		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}

	static class StaticInner { // 스태틱 클래스는 인스턴스, 클래스 변수 모두 가능.
		int d = 6; // 인스턴스 변수
		static int stat = 0; // 클래스 변수

		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}

	}
}

//익명 클래스
//일반적인(기존) 방법
class Some { // private int a를 가져오지 못해서 setter 메소드를 만들고, getter에 int a의 값을 받는다.
	private int a = 3;

	int getter() {
		return this.a;
	}

	void setter(int a) {
		this.a = a;
	}

	void a() {
		System.out.println("만듦");
	}
}

public class innerclass정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 oc = new OuterClass1();

		System.out.println("OuterClass1의 a값 : " + oc.a); // a의 값을 oc인스턴스로 접근
		System.out.println("OuterClass1의 b값 : " + OuterClass1.b); // b는 스태틱변수이므로 클래스 이름 자체로 접근 가능

		System.out.println("\n=== inner 클래스 접근하기 ===");
		OuterClass1 oc2 = new OuterClass1(); // 인스턴스 변수 접근 -> 인스턴스명.변수명 = new 인스턴스명
		OuterClass1.Inner i = oc2.new Inner(); // 인스턴스 변수 접근 -> 인스턴스명.변수명 = new 인스턴스명

		System.out.println("Inner의 c값 = " + i.c);
		i.innerMethod();

		OuterClass1.StaticInner si = new OuterClass1.StaticInner(); // 클래스 변수 접근 -> 클래스명.변수명
		System.out.println("StaticInner의 d값 = " + si.d); // int d가 static int d라면 OuterClass1.StaticInner.d로 가능.

		상속과다형성08.OuterClass1.StaticInner.staticMethod();
		OuterClass1.StaticInner.staticMethod(); // 스태틱 클래스의 스태틱 메서드는 클래스의 이름만으로도 참조

		// 익명클래스 :
		// 일반적인(기존) 방법
		Some s1 = new Some();
		s1.setter(4);
		System.out.println(s1.getter());
		s1.a();

		// 익명 클래스
		Some anooy = new Some() { // 인스턴스 생성할 때 블록 안에 클래스 내용 새로 정의
			private int a = 3; // Some클래스 오버라이딩

			int getter() {
				return this.a;
			}

			void setter(int a) {
				this.a = a;
			}

			void a() {
				System.out.println("새로만듦");
			}
		}; // 세미콜론 주의
		anooy.setter(5);
		System.out.println(anooy.getter());
		anooy.a(); // 오버라이딩 재정의

	}

}
