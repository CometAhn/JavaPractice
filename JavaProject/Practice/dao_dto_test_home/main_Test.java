package dao_dto_test_home;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class data {
	public static void start() {
		Scanner select = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("\t데이터 입력 : 1,\n\t입력한 데이터 조회 : 2\n\t프로그램 종료 : 3\n");
				int choose = select.nextInt();

				if (choose == 1) {
					data.add();
				} else if (choose == 2) {
					data.print();
				} else if (choose == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("1, 2, 3 중 하나의 값을 입력해주세요.");
					continue;
				}

			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.\n");
			data.start();
		} catch (Exception e) {
			System.out.println("오류가 발견되었습니다.");
			System.out.println("오류 명 : " + e.toString());
		}
	}

	public static void add() {
		dto personadd = new dto();
		dao person = new dao();

		String name;
		int age;
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("이름은?");
		name = input1.next();
		System.out.println("나이는?");
		age = input2.nextInt();

		personadd.setName(name);
		personadd.setAge(age);

		person.addRegister(personadd);

		System.out.println("데이터 입력 완료\n\n");
	}

	public static void print() {
		ArrayList<dto> tmp = dao.register;

		System.out.printf("\n\n데이터 조회\n");
		for (int i = 0; i < tmp.size(); i++) {
			dto dt = tmp.get(i);
			String name = dt.getName();
			int age = dt.getAge();

			System.out.printf("%d번째 데이터(이름 : %s, 나이 : %d)\n", i + 1, name, age);
		}

		System.out.printf("출력 완료\n\n");
	}

}

public class main_Test {

	public static void main(String[] args) {
		System.out.println("원하는 기능의 숫자를 입력하세요. :");
		data.start();
	}

}
