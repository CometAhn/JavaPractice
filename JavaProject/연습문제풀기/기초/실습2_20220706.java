package 기초;

import java.util.Scanner;

public class 실습2_20220706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 입력하세요. :");
		String xxx = scan.next();

		System.out.println("생년월일(mm/dd/yy)을 입력하세요. :");
		String birth = scan.next();

		int index = birth.indexOf("/");

		String month = birth.substring(0, index);

		birth = birth.substring(index + 1, birth.length());

		index = birth.indexOf("/");

		String day = birth.substring(0, index);

		String year = birth.substring(index + 1, birth.length());

		System.out.println("이름 : " + xxx);

		System.out.printf("생년월일 : %s.%s.%s", year, month, day);

	}

}
//
//2. 사용자로 부터 이름(XXX)과 생년월일(mm/dd/yy)을 입력 받은 후 다음과 같이 출력하는 프로그램을 설계한 후 작성하라.
//
//이름을 입력하세요 : 홍길동
//생년월일(mm/dd/yy)을 입력하세요 : 10/05/16
//이름 : 홍길동
//생년월일: 16.10.05