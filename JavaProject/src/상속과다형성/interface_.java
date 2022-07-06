package 상속과다형성;

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

public class interface_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}
