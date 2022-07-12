package Ch06_Class;

class sub {
	int result; // 속성(변수)

	int calculator(int a, int b) { // calculator :메서드, 함수(기능)
		result = a + b;
		return result;
	}
}

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;

	void power() {
		powerOn = !powerOn;
	}

	void speedUp() {
		speed++;
	}

	void speedDown() {
		speed--;
	}

	void wiper() {
		wiperOn = !wiperOn;
	}
}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub sb = new sub();
		int sum = sb.calculator(100, 200);
		System.out.println(sum);

		Car mycar = new Car();

		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);

		mycar.power();
		System.out.println("시동 켜짐? : " + mycar.powerOn);
		mycar.power();
		System.out.println("시동 켜짐? : " + mycar.powerOn);
		mycar.color = "black";
		System.out.println("차 색 : " + mycar.color);

	}

}
