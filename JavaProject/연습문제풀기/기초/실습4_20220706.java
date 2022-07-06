package 기초;

import java.util.Scanner;

public class 실습4_20220706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("과일 이름들을 입력하세요.");
		String fruits = scan.nextLine();

		int index = fruits.indexOf(" ");

		String one = fruits.substring(0, index);

		fruits = fruits.substring(index + 1, fruits.length());

		String two = fruits.substring(0, index);

		fruits = fruits.substring(index + 1, fruits.length());

		String three = fruits.substring(0, index);

		String four = fruits.substring(index, fruits.length());

		String output = four + " " + three + " " + two + " " + one;

		System.out.println(output);

	}

}
// 4개의 과일 이름들을 입력 받은 후 역순으로 출력하는 프로그램을 설계한 후 작성하라. 
// 모든 과일 이름은 연속된 글자들로 이루어 진다. 첫 번째 과일 이름 앞에는 빈 칸이 없고, 빈 칸을 이용하여 과일 이름들을 서로 구별한다.
// 과일 이름들을 입력하세요: 사과 포도 감 바나나
// 바나나 감 포도 사과
