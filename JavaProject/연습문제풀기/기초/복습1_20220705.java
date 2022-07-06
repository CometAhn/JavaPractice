// 전화번호 생성, 출력 프로그램
// 0XY-ZZZ-ZZZZ의 형태. 제약사항
// 1. 첫번째 숫자는 0
// 2. 두번째 숫자 X는 2~6사이의 정수
// 3. 세번째 숫자 Y는 1부터7 사이의 정수
// 4. 숫자 Z는 0~9사이의 정수

package 기초;

import java.util.Random;

public class 복습1_20220705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 무작위 전화번호. Random rand = new Random(); String pnumber = "0";
		 * 
		 * pnumber += rand.nextInt(5) + 2; pnumber += rand.nextInt(6) + 1;
		 * 
		 * pnumber += "-";
		 * 
		 * pnumber += rand.nextInt(10); pnumber += rand.nextInt(10); pnumber +=
		 * rand.nextInt(10);
		 * 
		 * pnumber += "-";
		 * 
		 * pnumber += rand.nextInt(10); pnumber += rand.nextInt(10); pnumber +=
		 * rand.nextInt(10); pnumber += rand.nextInt(10);
		 * 
		 * System.out.println(pnumber);
		 */

		// 원기둥의 부피와 표면적을 계산 하려고 한다.
		// 원기둥 밑의 반지름과 원기등의 높이는
		// 1부터 10사이의 임의의 정수여야 한다.

		// 원기둥의 부피와 표면적을 계산하는 공식은 다음과 같다.
		// 부피: 원주율 *반지름*반지름*높이
		// 표면적 : 2*원주율*반지름*높이
		// 반지름 =5
		// 높이 = 10
		// 부피 785.3975
		// 표면적 = 471.2385

		// 변수들을 선언한다.
		final double PI = 3.14159;
		int radius; // 반지름

		// 원기둥의 높이, 부피, 표면적을 저장하는 변수들

		// 여기에 코드 삽입
		int height;
		int volume;
		int p;

		// Random 객체를 생성하고 generator가 그 객체를 가리키게 한다.
		Random generator = new Random();

		// 1부터 10까지의 임의의 정수를 생성하여 원의 반지름으로 한다.
		radius = generator.nextInt(10) + 1;

		// 1부터 10가지의 임의의 정수를 생성하여 원기둥의 높이로 한다.
		// 여기에 코드 삽입
		height = generator.nextInt(10) + 1;

		// 원 기둥의 부피를 계산한다.
		volume = (int) (PI * radius * radius * height);

		// 원기둥의 표면적을 계산한다.
		p = (int) (2 * PI * radius * height);
		// 여기에 코드 삽입

		// 원기둥 밑의 원의 반지름을 출력한다.
		System.out.println("반지름 = " + radius);

		// 원기둥의 높이를 출력한다.
		// 여기에 코드 삽입
		System.out.println("반지름 = " + height);
		// 원기둥의 부피를 출력한다.
		// 여기에 코드 삽입
		System.out.println("부피 = " + volume);
		// 원기둥의 표면적을 출력한다.
		// 여기에 코드 삽입
		System.out.println("표면적 = " + p);

	}

}
