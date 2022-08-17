/**
 *  다향성의 활용.
 *  조상 클래스 : Animal
 *  자손 클래스 : Lion, Rabbit, Monkey
 *  
 *  ZooKeeper 클래스는 feed 함수는 Animal을 받아서 출력.
 *  
 */

package Ch06_Class;

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal { // 동물 클래스를 상속한 사자 클래스
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal { // 동물 클래스를 상속한 토끼 클래스
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal { // 동물 클래스를 상속한 원숭이 클래스
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper {
	void feed(Animal animal) { // 사육사 클래스
		System.out.println(animal + "에게 먹이주기");
	}
}

public class Polymorphism4 {

	public static void main(String[] args) {
		ZooKeeper james = new ZooKeeper();
		Animal lion1 = new Lion();
		Animal Rabbit1 = new Rabbit();
		Animal Monkey1 = new Monkey();
		james.feed(lion1);
		james.feed(Rabbit1);
		james.feed(Monkey1);
	}

}
