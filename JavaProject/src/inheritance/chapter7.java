package inheritance;

class Person {
	void breath() {
		System.out.println("숨쉬기");
	}

	void eat() {
		System.out.println("밥먹기");
	}

	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person { // 부모 - Person
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person { // 부모 - Person

	void teach() {
		System.out.println("가르치기");
	}
}

public class chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.breath(); // 부모에게 상속 받은 기능은 선언없이 사용 가능.
		s1.eat(); // 부모에게 상속 받은 기능은 사용 가능.
		s1.say(); // 부모에게 상속 받은 기능은 사용 가능.
		s1.learn(); // Student의 기능.

		Teacher t1 = new Teacher();
		t1.breath(); // 부모에게 상속 받은 기능은 사용 가능.
		t1.eat(); // 부모에게 상속 받은 기능은 사용 가능.
		t1.say(); // 부모에게 상속 받은 기능은 사용 가능.
		t1.teach(); // Teacher의 기능.

	}

}
