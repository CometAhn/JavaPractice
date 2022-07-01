package pakage;

import Class_.Constructor_Class;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		상속.pakagePractice test = new 상속.pakagePractice();
		// test.say();

		Constructor_Class b = new Constructor_Class("black", 64);
		System.out.println(b.model);
		System.out.println(b.color);
		System.out.println(b.capacity);

		b.say();
	}

}
