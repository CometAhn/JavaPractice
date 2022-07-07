package Ch06_Class_;

final class FinalClass {
	final int number = 4;
}

class Parent /* extends FinalClass */ {// final FinalClass 오류

	final void finalMethod() {
		System.out.println("상속 불가능한 메소드");
	}
}

class Son extends Parent {
	// void finalMethod() {} // 상속 불가한 메소드

}

public class Class_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		// member1.number = 3;// 상수는 변경 불가

	}

}
