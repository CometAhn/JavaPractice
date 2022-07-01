package 상속;

import Class_.Class_Construnctor; // 다른 팩키지 클래스 가져옴

public class pakagePractice {

	public void say() {
		System.out.println("다른 팩키지 사용");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class_.Class_Construnctor a = new Class_.Class_Construnctor();
		// import 안 할 시 인스턴스 만들 때 팩키지명.클래스명 사용.
		Class_Construnctor a = new Class_.Class_Construnctor();
		a.say();

	}

}
