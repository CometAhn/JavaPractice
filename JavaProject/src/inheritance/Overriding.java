package inheritance;

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
		super.lean(); // super : 클래스명 대신에 사용. 부모의 클래스 지칭.
	}

	@Override // Source - Overrrid/Implement Method...
	void eat() {
		// TODO Auto-generated method stub
		super.eat(); // super : 클래스명 대신에 사용. 부모의 클래스 지칭.
	}

	@Override // Source - Overrrid/Implement Method...
	void say() {
		System.out.println("선생님께 인사."); // say 재정의
	}

}

//this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.
//super :  클래스명 대신에 사용. 부모의 클래스 지칭.
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
