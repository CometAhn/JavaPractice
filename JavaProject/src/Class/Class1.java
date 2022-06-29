package Class;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar = new Car();
		Car mycar1 = new Car();

		mycar.color = "black";
		mycar1.color = "red";
		mycar.speedUp();
		mycar1.wiper();

		System.out.println("1번차 색 : " + mycar.color);
		System.out.println("2번차 색 : " + mycar1.color);
		System.out.println("1번차 속도 : " + mycar.speed);
		System.out.println("2번차 속도 : " + mycar1.speed);
		System.out.println("1번차 와이퍼 : " + mycar.wiperOn);
		System.out.println("2번차 와이퍼 : " + mycar1.wiperOn);

	}

}
