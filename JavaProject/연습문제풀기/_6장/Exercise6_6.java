package _6장;

import java.util.Random;

class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		// return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
		return Math.sqrt(((x - x1) * (x - x1)) + (((y - y1) * (y - y1))));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDistance(1, 1, 2, 2));

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
		int a = generator.nextInt(6) + 1;
		System.out.println(a);
		float b = generator.nextFloat() * 6;
		int c = (int) b + 1;
		System.out.println(c);

	}

}
