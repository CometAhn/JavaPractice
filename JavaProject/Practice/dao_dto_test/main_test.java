package dao_dto_test;

import java.util.ArrayList;
import java.util.Scanner;

class start {

	void go() {
		dao test1 = new dao();

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("이름은?");
		String name = input1.next();
		System.out.println("나이는?");
		int age = input2.nextInt();

		dto test = new dto();
		test.name = name;
		test.age = age;
		test1.addVal(test);
	}

}

class result {

	void end() {

		ArrayList<dto> tmp = dao.array;

		for (int i = 0; i < tmp.size(); i++) {
			dto dt = new dto();
			dt = tmp.get(i);
			String name = dt.getName();
			int age = dt.getAge();
			System.out.println(i + 1 + "번째 등록");
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
		}
	}
}

public class main_test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		start go1 = new start();
		result end1 = new result();

		while (true) {
			System.out.println("실행하려면 1, 종료하려면 0");

			int a = input.nextInt();

			if (a == 1) {
				go1.go();
			} else {
				end1.end();
				break;
			}
		}
	}

}
