package Ch07_inheritance_N_Polymorphism;

import Ch06_Class.Constructor_Class;

public class pakagePractice {

	public void say() {
		System.out.println("다른 팩키지 사용");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class_.Class_Construnctor a = new Class_.Class_Construnctor();
		// import 안 할 시 인스턴스 만들 때 팩키지명.클래스명 사용.
		Constructor_Class a = new Ch06_Class.Constructor_Class("white", 128);
		a.say();

	}

}
