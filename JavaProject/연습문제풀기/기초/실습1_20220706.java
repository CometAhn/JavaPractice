package 기초;

import java.util.Scanner;

public class 실습1_20220706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 대학생의 이름, 학번과 학과를 한줄의 문자열로 입력 받은 후 이름, 학번과 학과를 세 줄에 걸쳐 출력하는 프로그램을 설계한 후 작성하라.
//		입력 받은 문자열내의 각 항목 사이에는 /가 있어야 한다.
//
//		이름, 학번과 학과를 입력하세요: 홍길동/180257/컴퓨터공학과
//		이름 : 홍길동
//		학번 : 180257
//		학과 : 컴퓨터공학과
		System.out.print("이름, 학번과 학과를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		int index = input.indexOf("/");

		System.out.println();

		String name = input.substring(0, index);

		String rest = input.substring(index + 1, input.length());

		index = rest.indexOf("/");

		String num = rest.substring(0, index);

		String class1 = rest.substring(index + 1, rest.length());

		System.out.println("이름 : " + name);
		System.out.println("학번 : " + num);
		System.out.println("학과 : " + class1);
	}

}
