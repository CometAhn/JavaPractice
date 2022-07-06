package inheritance_N_Polymorphism;

abstract class Pokemon {
	String name;

	abstract void attack();

	abstract void sound();

	String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon {
	Pikachu() {
		this.name = "피카츄";
	}

	@Override
	void attack() {
		System.out.println("전기 공격");

	}

	@Override
	void sound() {
		System.out.println("피카 피카!");

	}

}

class Squirtle extends Pokemon {
	Squirtle() {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물 공격");

	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");

	}

}

public class abstract_ {

	public static void main(String[] args) {

		Pikachu pikachu = new Pikachu();
		System.out.println("이 포켓몬은 :" + pikachu.getName());
		pikachu.attack();
		pikachu.sound();
		Squirtle squirtle = new Squirtle();
		System.out.println("이 포켓몬은 :" + squirtle.getName());
		squirtle.attack();
		squirtle.sound();
	}

}
