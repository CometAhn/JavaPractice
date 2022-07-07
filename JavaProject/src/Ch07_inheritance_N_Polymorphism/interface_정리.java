package Ch07_inheritance_N_Polymorphism;

interface Camera {

	void Photo();
}

interface Call {
	void calling();
}

interface Memo {
	void write();
}

interface Clock {
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock {

	@Override
	public void clock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void write() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Photo() {
		// TODO Auto-generated method stub

	}

}

class PhoneUser {
	void call(Call c) { // 인터페이스 Call의 calling 메소드 대입.
		System.out.println("전화를 걸었습니다.");
	}

	void memo(Memo m) { // 인터페이스 Memo의 memo 메소드 대입.
		System.out.println("메모 작성.");
	}

	void camera(Camera c) { // 인터페이스 Camera의 photo 메소드 대입.
		System.out.println("카메라 기능 켬.");
	}

	void clock(Clock c) { // 인터페이스 Call의 calling 메소드 대입.
		System.out.println("시간 보기.");
	}
}

////////////////////////////
///////////////////////////

interface Providable {

	void leisureSports();

	void sightseeing();

	void food();
}

class KoreaTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("전주 비빔밥 투어");
	}

}

class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("도쿄타워 번지점프 투어");

	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("오사카 관람 투어");

	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("초밥 투어");

	}

}

class EUTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("스카이다이빙 투어");

	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("알프스 관람");

	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("피자 투어");

	}

}

class TourGuide {
	private Providable tour = new EUTour(); // 인터페이스로 타입 선언

	public void leisureSports() {
		tour.leisureSports();
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}
}

public class interface_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TourGuide guide = new TourGuide();
//		guide.leisureSports();
//		guide.sightseeing();
//		guide.food();

		// 각 클래스 메소드 : PhoneUser, call();
		// 각 클래스 메소드 : MyCellPhone : clock();, write();, calling();, Photo();

		MyCellPhone phone1 = new MyCellPhone(); // 네 가지 기능 다 가능
		Camera phone2 = new MyCellPhone(); // 카메라만 사용가능
		Call phone3 = new MyCellPhone(); // 전화만 가능
		Memo phone4 = new MyCellPhone(); // 메모만 가능
		Clock phone5 = new MyCellPhone(); // 시계만 가능

		PhoneUser user1 = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		user1.memo(phone1);
		user1.memo(phone4);
		user1.camera(phone1);
		user1.camera(phone2);
		user1.clock(phone1);
		user1.clock(phone5);

	}

}
