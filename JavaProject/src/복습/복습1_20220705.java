// 전화번호 생성, 출력 프로그램
// 0XY-ZZZ-ZZZZ의 형태. 제약사항
// 1. 첫번째 숫자는 0
// 2. 두번째 숫자 X는 2~6사이의 정수
// 3. 세번째 숫자 Y는 1부터7 사이의 정수
// 4. 숫자 Z는 0~9사이의 정수

package 복습;

import java.util.Random;

public class 복습1_20220705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		String pnumber = "0";

		pnumber += rand.nextInt(5) + 2;
		pnumber += rand.nextInt(6) + 1;

		pnumber += "-";

		pnumber += rand.nextInt(10);
		pnumber += rand.nextInt(10);
		pnumber += rand.nextInt(10);

		pnumber += "-";

		pnumber += rand.nextInt(10);
		pnumber += rand.nextInt(10);
		pnumber += rand.nextInt(10);
		pnumber += rand.nextInt(10);

		System.out.println(pnumber);

//		  
//		  if (x > 1 && x < 7) {
//		  
//		  }
//		  
//		  if (y > 0 && y < 8) {
//		  
//		  } if (z >= 0 && z <= 9) {
//		  
//		  }
//		 

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
	}

}
