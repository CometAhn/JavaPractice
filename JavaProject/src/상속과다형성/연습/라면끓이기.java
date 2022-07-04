package 상속과다형성.연습;

abstract class ramen {
	String name;

	ramen(String name) { // 인스턴스 인수
		this.name = name;
	}

	void recipe( /* String name */ ) { // 메소드 인수
		System.out.println(this.name + "라면 끓이는 법");
		System.out.println("1. 물 끓인다.");
		System.out.println("2. 스프와 라면을 넣는다.");
	}

	abstract void add();
}

class cheese extends ramen {

	cheese(String name) {// 인스턴스 인수
		super(name);
	}

	@Override
	void add() {
		System.out.println("3. 치즈를 넣는다.\n");

	}

}

class ddeock extends ramen {

	ddeock(String name) {// 인스턴스 인수
		super(name);
	}

	@Override
	void add() {
		System.out.println("3. 떡을 넣는다.\n\n");

	}

}

public class 라면끓이기 {

	static void func(ramen ramen) { // b-type
		ramen.recipe();
		ramen.add();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cheese cramen = new cheese("치즈"); // 인스턴스 생성, 클래스 인수?멤버? name
		ddeock dramen = new ddeock("떡");

		// cramen.recipe(/*"치즈"*/); // 메소드 인수 // a-type
		// cramen.add();
		// dramen.recipe(/*"떡"*/); // 메소드 인수
		// dramen.add();

		func(cramen); // b-type
		func(dramen);

	}

}
