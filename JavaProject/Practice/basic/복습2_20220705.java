package basic;

import java.util.Scanner;

public class 복습2_20220705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str; // 입력받는 문자열
		int length; // 문자열의 길이
		int index; // 지수
		char ch; // 마지막 문자
		String rest; // 남은 문자열
		String outputStr = ""; // 출력 문자열

		// Scanner 객체를 생성하고 변수 scan이 그 객체를 가리키게 한다
		Scanner scan = new Scanner(System.in);

		// 문자열을 입력받는다
		System.out.print("길이가 3인 문자열을 입력하세요: ");

		// 코드 삽입
		str = scan.next();

		// 입력 문자열을 출력한다
		// 코드 삽입
		System.out.println("입력된 문자열 : " + str);

		// 문자열의 길이를 구한다
		// 코드 삽입
		length = str.length();

		// 마지막 문자를 끄집어 낸다
		// 코드 삽입
		ch = str.charAt(length - 1);

		// 마지막 문자를 제거한 후 남은 문자열을 rest가 가리키게 한다
		// 코드 삽입
		rest = str.substring(0, str.length() - 1);

		// 끄집어 낸 문자를 출력 문자열의 끝에 추가한다
		// 코드 삽입
		outputStr += ch;

		// 남은 문자열의 길이를 구한다
		// 코드 삽입
		length = rest.length();

		// 남은 문자열의 마지막 문자를 끄집어 낸다
		// 코드 삽입
		outputStr += rest.charAt(length - 1);

		// 마지막 문자를 제거한 후 남은 문자열을 rest가 가리키게 한다
		// 코드 삽입
		rest = str.substring(0, rest.length() - 1);

		// 끄집어 낸 문자를 출력 문자열의 끝에 추가한다
		// 코드 삽입
		outputStr += rest;

		// 남은 문자열을 출력 문자열의 끝에 추가한다
		// 코드 삽입
		// System.out.print(rest);

		// 출력 문자열을 출력한다
		// 코드 삽입
		System.out.println(outputStr);
//
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("길이가 3인 문자열을 입력하세요. :");
//		String input = in.next();
//
//		System.out.print(input.substring(2, 3));
//		System.out.print(input.substring(1, 2));
//		System.out.print(input.substring(0, 1));
//
	}

}
//
//문자열 역순으로 출력
//
//사용자로부터 길이가 3인 문자열을 입력 받아 역순으로 출력하는 프로그램을 작성하라.
//
//출력
//길이가 3인 문자열을 입력하세요 : 무궁화
//입력 문자열 : 무궁화
//출력 문자열 : 화궁무
