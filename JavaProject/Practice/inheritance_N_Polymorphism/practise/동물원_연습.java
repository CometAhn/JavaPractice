package inheritance_N_Polymorphism.practise;

class animal {
	void breath() {
		System.out.println("숨쉰다.");
	}

}

class lion extends animal {

	public String toString() {
		return "사자";
	}

}

class rabbit extends animal {

	public String toString() {
		return "토끼";
	}

}

class monkey extends animal {

	public String toString() {
		return "원숭이";
	}

}

class zookeaper {

	void fead(animal animal) {
		System.out.println(animal + "에게 먹이를 준다.");
	}

}

public class 동물원_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal lion = new lion(); // lion 인스턴스
		animal rabbit = new rabbit(); // rabbit 인스턴스
		animal monkey = new monkey(); // monkey 인스턴스
		zookeaper man = new zookeaper(); // man 인스턴스

		man.fead(lion); // fead 메소드 실행.
		man.fead(rabbit);
		man.fead(monkey);
		lion.breath();

	}

}
