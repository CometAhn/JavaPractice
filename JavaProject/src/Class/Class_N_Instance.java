package Class;

class Cars {

	static int wheel = 4; // 클래스 변수
	int speed; // 인스턴스 변수
	boolean StartOn;

	void Start() {
		StartOn = !StartOn;
	}

}

public class Class_N_Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Cars.wheel);// 클래스 변수는 인스턴스 없이 (클래스 명.클래스 변수)로 사용.
		// System.out.println(Cars.speed); // 오류

		Cars mycar = new Cars(); // 인스턴스
		System.out.println(mycar.speed); // 인스턴스 변수는 인스턴스 생성 후 (인스턴스명.인스턴스 변수)로 사용 가능.
		System.out.println(mycar.wheel); // 클래스 변수는 인스턴스 생성 후 (인스턴스명.인스턴스 변수)도 사용 가능.

		Cars mycar1 = new Cars();
		System.out.println(mycar.speed);
		System.out.println(mycar1.speed);

		Cars mycar2 = new Cars();
		System.out.println("변경 전 : ");
		System.out.println("mycar1 speed : " + mycar1.speed);
		System.out.println("mycar2 speed : " + mycar2.speed);
		System.out.println("mycar1 wheel : " + mycar1.wheel);
		System.out.println("mycar2 wheel : " + mycar2.wheel);

		mycar2.speed = 100;
		mycar2.wheel = 5; // 클래스 변수
		System.out.println("변경 후 : ");
		System.out.println("mycar1 speed : " + mycar1.speed);
		System.out.println("mycar2 speed : " + mycar2.speed);
		System.out.println("mycar1 wheel : " + mycar1.wheel); // 클래스 변수는 메모리를 공유하기에 같이 바뀜
		System.out.println("mycar2 wheel : " + mycar2.wheel); // 클래스 변수는 메모리를 공유하기에 같이 바뀜
		System.out.println("mycar2 wheel : " + Cars.wheel); // 클래스 변수는 메모리를 공유하기에 같이 바뀜

	}

}
