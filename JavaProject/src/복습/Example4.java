package 복습;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = a; System.out.println(a); // 10
		 * 
		 * b += a; System.out.println(b); // 20
		 * 
		 * b = a = 10; System.out.println(b); // 10
		 * 
		 * b += a; System.out.println(b); // 20
		 * 
		 * b -= a; System.out.println(b); // 10
		 * 
		 * b *= a; System.out.println(b); // 100
		 * 
		 * b /= a; System.out.println(b); // 10
		 * 
		 * b %= a; System.out.println(b); // 0
		 * 
		 * b = a = 10;
		 * 
		 * System.out.println(b); // 10
		 * 
		 * b = b + a; System.out.println(b); // 20
		 * 
		 * b = b - a; System.out.println(b); // 10
		 * 
		 * b = b * a; System.out.println(b); // 100
		 * 
		 * b = b / a; System.out.println(b); // 10
		 * 
		 * b = b % a; System.out.println(b); // 0
		 * 
		 * int aa = 12; int bb = 4; int cc = 19;
		 * 
		 * int max = (aa > bb ? aa : bb); System.out.println(max > cc ? max : cc);
		 */
		/*
		 * int a = 100; int b = 112; int c = 5124; int d = 12; int min;
		 * 
		 * min = (a > b ? b : a); // a가 b보다 크다면? min은 b 아니라면 a min = (min > c ? c :
		 * min); // min이 c보다 크다면? min은 c 아닐 경우 min min = (min > d ? d : min); // min이
		 * d보다 크다면? min은 d, 아닐 경우 c
		 * 
		 * System.out.println(min);
		 */

		// 2 8 16
		// 63: 1/1111 0077 0x3f
		// 126:111/1110 0176 0x7e
		// 72: 100/1000 0110 0x48
		// 99: 110/0011 0143 0x63

		// 128643216/8421 64 8 1
		// 0x3F 0011/1111 = 63 77
		// 0xDA 1101/1010 = 218 332
		// 0x9E 1001/1110 = 158 236
		// 0x25 0010/0101 = 37 45
		/*
		 * int a = 15; // 1111 int b = 5; // 0101
		 * 
		 * System.out.println(a | b); // 1111 15 System.out.println(a & b); // 0101 5
		 * System.out.println(a ^ b); // 1010 10 System.out.println(a >> 2); // 1111
		 * 0011 3 System.out.println(b << 4); // 01010000 80
		 */

		// age가 19세 이상이면 "성입입니다." 미만이면, "미성년자입니다."
		/*
		 * int age = 19; Scanner input = new Scanner(System.in);
		 * System.out.println("몇 살인가요?"); age = input.nextInt();
		 * 
		 * if (age >= 19) { System.out.println("판매가 가능한 물품입니다."); } else {
		 * System.out.println("미성년자에게 판매가 불가능한 물품입니다."); }
		 */

		// 요금 계산
		// 20세 이상이면 성인 요금
		// 14 ~ 19 청소년 요금
		// 9 ~ 13 어린이 요금
		// 9세 미안 유아 요금
		/*
		 * int age; Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("몇 살인가요?"); age = input.nextInt();
		 * 
		 * if (age >= 20) { System.out.println("성인입니다");
		 * System.out.println("성인 요금이 부과됩니다."); } else if (age >= 14) {
		 * System.out.println("청소년입니다"); System.out.println("청소년 요금"); } else if (age >=
		 * 9) { System.out.println("어린이입니다."); System.out.println("어린이 요금이 부과됩니다"); }
		 * else { System.out.println("유아입니다."); System.out.println("유아 요금이 부과됩니다"); }
		 */

		// 메뉴 1짜장면 2짬뽕 3탕수육 4, 팔보채
		int menu = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴 번호 : ");
		menu = input.nextInt();
		String a = "";
		switch (menu) {
		case 1:
			a = "짜장면";
			break;
		case 2:
			a = "짬뽕";
			break;
		case 3:
			a = "탕수육";
			break;
		case 4:
			a = "팔보채";
			break;
		}

		if (menu == 1) {
			System.out.println(a + "을 주문하셨습니다.");
		} else if (menu == 2) {
			System.out.println(a + "을 주문하셨습니다.");
		} else if (menu == 3) {
			System.out.println(a + "을 주문하셨습니다.");
		} else if (menu == 4) {
			System.out.println(a + "를 주문하셨습니다.");
		} else {
			System.out.println("잘못 주문하셨습니다.");
		}
	}

}
