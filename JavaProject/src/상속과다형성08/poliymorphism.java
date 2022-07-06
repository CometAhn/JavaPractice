package 상속과다형성08;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class poliymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new B();
		// B obj1 = new A(); // 왜 안되지? 타입 미스매치

		// B obj1 = (B) new A();
		// obj1.methodA();// 이건 왜 오류?

		B obj1 = (B) new B();
		obj1.methodA();
		obj.methodA();
		// obj.methodB(); // 부모는 자식 변수를 참조받을 수 없다.

	}

}
