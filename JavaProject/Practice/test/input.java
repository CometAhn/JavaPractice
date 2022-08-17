package test;

import java.util.Scanner;

public class input {
	dao DAO = new dao();

	public void person_add() {
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		String name;
		int age;
		// 변수 준비 끝
		System.out.println("이름을 입력해주세요");
		name = sc.nextLine();
		System.out.println("나이를 입력해주세요");
		age = sd.nextInt();
		// 변수 초기화 끝

		dto tmp = new dto();
		tmp.setName(name);
		tmp.setAge(age);

		DAO.addBank(tmp);

	}
}
