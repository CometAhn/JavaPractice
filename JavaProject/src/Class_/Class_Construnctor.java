package Class_;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;

	Cellphone(String color, int capacity) {// Cellphone(인자1, 인자2)

		this.color = color; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.
		this.capacity = capacity; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.

	}
}

public class Class_Construnctor {
	public void say() {
		System.out.println("다른 팩키지에 쓸 수 있는지 테스트");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cellphone myphone = new Cellphone(); // Error
		Cellphone myphone1 = new Cellphone("silver", 64); // 생성자 인자대로 입력을 해줘야 함.
		Cellphone myphone2 = new Cellphone("black", 128); // 생성자 인자대로 입력을 해줘야 함.

		System.out.println(myphone1.model);
		System.out.println(myphone1.color);
		System.out.println(myphone1.capacity);

		System.out.println();

		myphone2.model = "Galaxy 9";
		System.out.println(myphone2.model);
		System.out.println(myphone2.color);
		System.out.println(myphone2.capacity);

	}

}
