package 상속과다형성;

class People {
	public void printinfo() {
		System.out.println("나는 사람이다.");
	}
}

class Man extends People {

}

class Women extends People {

}

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal {
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal {
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal {
	public String toString() {
		return "원숭이";
	}
}

class ZooKeaper {
	void feed(Animal animal) {
		System.out.println(animal + "에게 먹이 주기");
	}

	/*
	 * void feed(Animal animal) { System.out.println( animal + "에게 먹이 주기"); }
	 * 
	 * void feed(Animal animal) { System.out.println( animal + "에게 먹이 주기"); }
	 */
}

public class 다형성연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooKeaper James = new ZooKeaper();

		Animal lion1 = new Lion();
		James.feed(lion1);

		Animal rabbit1 = new Rabbit();
		James.feed(rabbit1);

		Animal monkey1 = new Monkey();
		James.feed(monkey1);

		// 사자, 토끼, 원숭이의 인스턴스를 생성할 때 다향성을 이용해서
		// 부모 클래스인 Animal을 참조변수로 각 인스턴스들을 참조합니다.
		// 그리고 사육사 클래스의 feed 메소드의 메개변수를 Animal 타입의 참조변수로 설정합니다.
		// 모든 인스턴스들의 참조변수의 타입이 Animal 이므로 메소드를 오버로딩 할 필요가 없고
		// 또 새로운 동물돌의 종류를 추가할 필요가 없다.

		People man1 = new Man();
		People women1 = new Women();
		man1.printinfo();
		women1.printinfo();
	}

}
