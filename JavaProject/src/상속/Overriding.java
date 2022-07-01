package 상속;

class Students {
	void lean() {
		System.out.println("배우기");
	}

	void eat() {
		System.out.println("밥먹기");
	}

	void say() {
		System.out.println("선생님 안녕하세요.");
	}
}

class Leader extends Students {

	@Override // Source - Overrrid/Implement Method...
	void lean() {
		// TODO Auto-generated method stub
		super.lean();
	}

	@Override // Source - Overrrid/Implement Method...
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override // Source - Overrrid/Implement Method...
	void say() {
		System.out.println("선생님께 인사."); // say 재정의
	}

}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students();
		Leader l1 = new Leader();

		s1.lean();
		s1.eat();

		l1.lean();
		l1.eat();

		l1.say();
		s1.say();

	}

}
