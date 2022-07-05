package _6장;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student() {
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		float avg = (float) (kor + eng + math) / 3;
		return (float) Math.round(avg * 10) / 10;
	}

	String info() {
		return name + ", " + ban + ", " + no + "," + kor + ", " + eng + ", " + math + ", " + getTotal() + ", "
				+ (float) Math.round(((float) kor + eng + math) / 3 * 10) / 10;
	}
}

public class Exercise6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름 :" + s.name);
		System.out.println("총점 :" + s.getTotal());
		System.out.println("평균 :" + s.getAverage());

		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s1.info());
	}

}

//[6-8]다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}

	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}
// 클래스변수(static 변수) :width, height
// 인스턴스 변수 : kind, num
// 지역변수 : k, n, card

class Marine1 {
	int x = 0, y = 0; // Marine (x,y) 위치좌표
	int hp = 60; // 현재체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	static void weaponUp() {
		weapon++;
	}

	static void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
