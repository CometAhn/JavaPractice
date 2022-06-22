package Operator;

class A {
}

class B extends A {
}

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub UP

		A a = new A();
		B b = new B();

		System.out.println("a instanceof A: " + (a instanceof A));
		System.out.println("b instanceof A: " + (a instanceof A));
		System.out.println("a instanceof B: " + (a instanceof B));
		System.out.println("b instanceof B: " + (b instanceof B));

	}

}
