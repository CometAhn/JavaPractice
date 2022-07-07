package pakageTest;

import Ch06_Class_.Constructor_Class;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch07_inheritance_N_Polymorphism.pakagePractice test = new Ch07_inheritance_N_Polymorphism.pakagePractice();
		// test.say();

		Constructor_Class b = new Constructor_Class("black", 64);
		System.out.println(b.model);
		System.out.println(b.color);
		System.out.println(b.capacity);

		b.say();
	}

}
