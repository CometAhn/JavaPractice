package 상속과다형성;

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

public class innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
