package basic;

import java.util.Scanner;

public class 실습4_20220706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("과일 이름들을 입력하세요.");
		String fruits = scan.nextLine();

		int index = fruits.indexOf(" "); // 문자열 검색

		String one = fruits.substring(0, index); // 젤 첨 과일 이름, 1

		fruits = fruits.substring(index + 1); // 나머지 과일, 2 3 4

		index = fruits.indexOf(" "); // 문자열 검색

		String two = fruits.substring(0, index);// 두 번째 과일 이름, 2

		fruits = fruits.substring(index + 1); // 나머지 과일, 3 4

		index = fruits.indexOf(" "); // 문자열 검색

		String three = fruits.substring(0, index); // 세 번째 과일, 3

		String four = fruits.substring(index + 1); // 네 번째 과일, 4

		String output = four + " " + three + " " + two + " " + one;

		System.out.println(output);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);

	}

}
// 4개의 과일 이름들을 입력 받은 후 역순으로 출력하는 프로그램을 설계한 후 작성하라. 
// 모든 과일 이름은 연속된 글자들로 이루어 진다. 첫 번째 과일 이름 앞에는 빈 칸이 없고, 빈 칸을 이용하여 과일 이름들을 서로 구별한다.
// 과일 이름들을 입력하세요: 사과 포도 감 바나나
// 바나나 감 포도 사과
