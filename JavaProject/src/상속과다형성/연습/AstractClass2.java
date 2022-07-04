package 상속과다형성.연습;

abstract class animal1 {

	String howling;
	String howling1;
	String name;
	int age;

	animal1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract void charming(); // 공통적으로 들어가는 건 추상화 하지 않음.

	void howl() {
		System.out.println(this.howling + " 내 이름은 " + this.name + "," + this.age + "살이다" + this.howling1);
	}
}

class Cat extends animal1 {

	Cat(String name, int age) {
		super(name, age);
		this.howling = "야옹!";
		this.howling1 = "옹!";
	}

	@Override
	void charming() {
		System.out.println("부비부비");

	}

}

class Dog extends animal1 {

	Dog(String name, int age) {
		super(name, age);
		this.howling = "멍멍!";
		this.howling1 = "멍!";
	}

	@Override
	void charming() {
		System.out.println("배 까고 드러눕기");

	}

}

public class AstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal1 cat = new Cat("나비", 5);
		animal1 dog = new Dog("바둑이", 3);
		cat.howl();
		cat.charming();
		dog.howl();
		dog.charming();

	}

}
