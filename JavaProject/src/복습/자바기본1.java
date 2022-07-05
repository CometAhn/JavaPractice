package 복습;

import java.util.Arrays;
import java.util.Random;

public class 자바기본1 {

	public static void main(String[] args) {

		String str = "Hello";

		System.out.println(str);

		int len = str.length(); // 문자 길이
		System.out.println(len);

		System.out.println(str.charAt(0));
		System.out.println(str.substring(1)); // n번째부터 끝까지. 처음은0
		System.out.println(str.substring(2, 4)); // n번째부터 n반쩨까지. 처음은 0
		System.out.println(str.indexOf("e")); // n번째부터 n반쩨까지. 처음은 0
		System.out.println(); // n번째부터 n반쩨까지. 처음은 0

		String str1 = "자바 프로그래밍은 어렵다!";

		System.out.println(str1.length());
		System.out.println(str1.indexOf("어")); // n번째부터 n반쩨까지. 처음은 0
		System.out.println(str1.substring(0, str1.indexOf("어렵다!")) + "쉽다!"); // 어렵다 =10번, 10번부터 쉽다 시작.
		System.out.println(str1.substring(0, 2) + str1.substring(9, 14)); // 어렵다 =10번, 10번부터 쉽다 시작.

		Random generator = new Random(); // 난수 인스턴스
		int a = generator.nextInt(6) + 1; // generator.nextInt(6)(0~5 생성) + 1
		System.out.println(a);
		float b = generator.nextFloat() * 6; // (0.00..1 ~ 0.99999) * 6 = 0.00..6 ~ 5.....
		int c = (int) b + 1; // (int) (0.00..1 ~ 0.99999) * 6 +1 = 1 ~ 6
		System.out.println(c);

		// 3~10까지 난수 만들기
		int d = generator.nextInt(8) + 3; // generator.nextInt(6)(0~6 생성) + 3
		System.out.println(d);
		float e = generator.nextFloat() * 8;
		int f = (int) e + 3;
		System.out.println(f);

		// 로또 번호 생성
		System.out.println("로또 번호 추첨");

		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) { // 번호 생성

			int random = generator.nextInt(45) + 1;
			number[i] = random;

		}

		for (int i = 0; i < number.length; i++) { // 중복 제거
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) { // 이전배열과 이후 배열의 값이 같다면
					System.out.println("중복떠서 이후 배열 값 변경." + "배열번호(이전 값) : " + (j + 1) + "(" + number[j] + ")");
					int random = generator.nextInt(45) + 1;
					number[j] = random; // 이후 배열 값 변경
					i = 0; // 바뀐값 첫 배열부터 다시 검증하기 위해 다시 for 돌리기.
					j = 1; // 바뀐값 첫 배열부터 다시 검증하기 위해 다시 for 돌리기.
				}
			}
		}

		System.out.println(Arrays.toString(number));
	}

}
