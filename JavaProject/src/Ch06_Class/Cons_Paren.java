package Ch06_Class;

class Car2 {
	String color;

	Car2(String color) {
		this.color = color;
	}
}

class SportsCar extends Car2 {
	int speedLimit;

	SportsCar(String color, int speedLimit) {
		// super(color); 1
		// this.color = color; 1-1
		super(color); // or 2
		this.speedLimit = speedLimit;
	}
}

class SportsCar1 extends Car2 {
	int speedLimit;

	SportsCar1(String color, int speedLimit) {
		// super(color); 1
		// this.color = color; 1-1
		super(color); // or 2
		this.speedLimit = speedLimit;
	}
}

public class Cons_Paren {

	public static void main(String[] args) {

		SportsCar sportsCar1 = new SportsCar("red", 330);
		SportsCar1 sportsCar2 = new SportsCar1("black", 330);

		System.out.println(sportsCar1.color);
		System.out.println(sportsCar1.speedLimit);
		System.out.println(sportsCar2.color);
		System.out.println(sportsCar2.speedLimit);

	}

}
