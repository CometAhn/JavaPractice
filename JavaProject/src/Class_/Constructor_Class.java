package Class_;

public class Constructor_Class {

	public String model = "Galaxy 8"; // .java 파일이름과 같은 퍼블릭 클래스를 써야만 타 팩키지의 클래스 안에서 사용가능.불편쓰

	public String color;
	public int capacity;

	public Constructor_Class(String color, int capacity) {// Cellphone(인자1, 인자2)

		this.color = color; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭. this.capacity =
		this.capacity = 0; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.

	}

	public void say() {
		System.out.println("다른 팩키지에 쓸 수 있는지 테스트");
	}

	public class Cellphone {
		String model = "Galaxy 8";
		String color;
		int capacity;

		public Cellphone(String color, int capacity) {// Cellphone(인자1, 인자2)

			this.color = color; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.
			this.capacity = capacity; // this : 클래스명 대신에 사용. 자기 자신의 클래스 지칭.

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cellphone myphone = new Cellphone(); // Error
		Constructor_Class myphone1 = new Constructor_Class("silver", 64); // 생성자 인자대로 입력을 해줘야 함.
		Constructor_Class myphone2 = new Constructor_Class("black", 128); // 생성자 인자대로 입력을 해줘야 함.

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
