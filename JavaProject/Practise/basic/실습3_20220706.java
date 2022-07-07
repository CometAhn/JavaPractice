package basic;

import java.util.Scanner;

public class 실습3_20220706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("한 줄의 문장을 입력하세요. :");
		String sentance = scan.nextLine();

		sentance.replace("나", "너"); // 왜 않대
		System.out.println(sentance);

		int index = sentance.indexOf("가을");

		String front = sentance.substring(0, index);

		sentance = sentance.substring(index, sentance.length());

		index = sentance.indexOf(" ");

		String back = sentance.substring(index - 1, sentance.length());
		String spring = "봄";

		System.out.println(front + spring + back);

	}
}
// 3. '가을'을 포함하는 한 줄의 문장을 입력 받은 후 그 문장 내의 '가을'을 '봄'으로 바꾸어 출력하는 프로그램을 설계한 후 작성하라. 
// 한 줄의 문장을 입력하세요 : 나는 가을을 좋아합니다.
// 나는 봄을 좋아합니다.