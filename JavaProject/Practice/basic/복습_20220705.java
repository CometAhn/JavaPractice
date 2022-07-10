package basic;

import java.util.Random;
import java.util.Scanner;

public class 복습_20220705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 점과 점 사이의 거리 구하기
		// 직각삼격형의 빗변의 길이 구하기.

		// 세변의 길이를 나타내는 함수

		double a, b, c; // 밑변, 높이, 빗변

		// System.out.print("밑변을 입력하세요 : ");
		// a = input.nextFloat();

		// System.out.print("높이을 입력하세요 : ");
		// b = input.nextFloat();

		// 빗변에 대한 계산
		// c = Math.sqrt(a * a + b * b);

		// 빗변 계산
		// c = Math.sqrt(a * a + b * b);

		// System.out.println("밑변 길이 : " + c);

		// 대학교의 신입생에게 임의의 학번을 부여하는 프로그램
		// 이름 생년월일 입력 받음.
		// yyyy는 연도, mm은 월 !~9는 두 자리, 10~12월은 두 자리.
		// dd는 일을 나타내고 1~9일은 한 자리, 10~31일은 두 자리.
		// 학번은 17로 시작하고 170000 형태를 취한다. 학번의 xxxx는 1000까지 정수여야 한다.
		// 실행 예
		// 이름을 입력하세요 : 홍길동
		// 생년월일을 입력하세요 : 2022/07/12
		// 학번 : 170005

		String name; // 이름
		String birthdate; // 생년월일
		String rest; // 남은 문자열
		String year; // 년
		String month; // 월
		String day; // 일
		int number; // 학번
		int index; // 지수

		// 이름 입력받는다.
		// 생년월일 입력 받는다.
		// 생년월일에서 "/"가 나오는 첫 번째 지수를 찾는다.
		// 생년월일에서 연도를 끄집어낸다.
		// 생년월일에서 연도와 "/"를 끄집어낸다.
		// 생년월일에서 연도와 "/"를 삭제한 후 남은 문자열을 rest가 가리게 된다.
		// 남은 문자열에서 "/"가 나오는 첫 번째 지수를 찾는다.
		// 남은 문자열에서 월을 끄집어낸다.
		// 남은 문자열에서 일을 끄집어낸다.
		// 1000부터 1009까지 임의의 번호를 생성한다.
		// 17로 시작하는 6자리 학번을 만든다.
		// 이름을 출력한다.
		// 생년월일을 출력한다.
		// 학번을 출력한다.

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out.print("이름을 입력하세요 : ");
		name = input.next();
		System.out.print("생년월일을 입력하세요(yyyy/mm/dd) : ");
		birthdate = input.next();

		year = birthdate.substring(0, 4);
		rest = birthdate.substring(5, birthdate.length());
		index = rest.indexOf("/");
		month = rest.substring(0, index);
		day = rest.substring(index + 1, rest.length());

		int mk = random.nextInt(10) + 1000;

		number = 170000 + mk;

		System.out.printf("이름 : %s\n", name);
		System.out.printf("생년월일 : %s년 %s월 %s일\n", year, month, day);
		System.out.printf("학번 : %d", number);

	}

}
