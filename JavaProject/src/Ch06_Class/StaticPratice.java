package Ch06_Class;

class StaticPractice {
	public static int number = 3;

	public static void say() {
		System.out.println("인스턴스를 생성하지 않고도 사용 가능합니다.");
	}

}

public class StaticPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticPractice.number);
		StaticPractice.say();
	}

}
