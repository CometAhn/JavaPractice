package 복습;

public class Switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;

		switch (a) { // ()변수 또는 식.

		case 1:
			a += 1;
			// System.out.println(a);
			break; // case끝나면 break꼭 넣기.

		case 2:
			a -= 1;
			// System.out.println(a);
			break;
		case 3:
			break;
		case 4:
			break;
		case 6:
			a += 3;
			break;
		default:
			// System.out.println(a);
			// 맨 밑은 break; 안 넣어도 됨!
		}

		// switch문을 이용하여 사용자가 월을 입력 시 그 월의 일 수를 출력하는 프로그램을 만들겠다.
		// 1월31일, 2월28일, 3월31일, 4월30일 5월31일, 6월30일,
		// 7월31일, 8월31일, 9월30일, 10월31일, 11월30일, 12월31일

		// 1~12월 중 원하는 달을 입력하세요 :
		// 1~12월이 아닌값을 입력시 다시 입력 문자를 출력하고 다시 입력 받게 하려고 한다.
		/*
		 * int month = 0; Scanner input = new Scanner(System.in);
		 * 
		 * while (true) {
		 * 
		 * System.out.printf("월을 입력해주세요. : "); month = input.nextInt();
		 * 
		 * if (month < 13) { switch (month) { case 1: case 3: case 5: case 7: case 8:
		 * case 10: case 12: System.out.printf("선택하신 %d월은 31일까지입니다.", month); break;
		 * 
		 * case 2: System.out.printf("선택하신 %d월은 28일까지입니다.", month); break;
		 * 
		 * case 4: case 6: case 9: case 11: System.out.printf("선택하신 %d월은 30일까지입니다.",
		 * month); break; } break; } else { System.out.printf("범위에서 벗어난 값입니다.(%d)\n",
		 * month); System.out.println("1~12월 사이의 값을 입력해주세요."); continue; } }
		 */

	}
}
