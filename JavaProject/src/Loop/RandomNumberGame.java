package Loop;

import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 맞추기 게임.
		// 랜덤한 숫자(random) 생성. 랜덤 : 72; 몰?루
		// ㄴ Math.random() : 0~1 구간에서 소수점의 난수를 생성.
		// 숫자를 입력하세요 : Scanner input
		// input이 random보다 작다, 크다, 같다
		// ㄴ 같을 경우, n번만에 맞췄습니다.
		// ㄴ 다시 진행 하시겠습니까?((Y/N))
		// ㄴ Y는 continue, N는 break;
		// 최소값, 최대값보다 크거나 작을 때 continue 등 그냥 추가.

		Scanner input = new Scanner(System.in);
		// Scanner in = new Scanner(System.in);
		// Scanner uumin = new Scanner(System.in);
		// Scanner uumax = new Scanner(System.in);

		int num = 0; // user가 입력할 숫자.
		int cnt = 0; // 카운트
		char yn; // 게임 재진행 여부

		// 사용자가 범위 지정하기
		int umin = 0;
		int umax = 0;

		System.out.printf("게임에서 사용할 최소 범위를 지정해주세요\n");
		umin = input.nextInt();

		System.out.printf("게임에서 사용할 최대 범위를 지정해주세요\n");
		umax = input.nextInt();

		int min = umin; // 지정된 최소값
		int max = umax; // 지정된 최대값

		int random = (int) (Math.random() * 100000); // 랜덤하게 생성할 숫자. (0~많이)
		System.out.printf("랜덤 숫자 생성중\n"); // while문 돌리는 동안 시간걸림

		while (true) {
			if ((umin > random) || (umax < random)) { // 사용자가 지정한 값을 벗어나면.
				random = (int) (Math.random() * 1000000000); // 다시 값 정하기
				continue; // 조건물 탈출
			} else { // 값 안이면
				break;
			}
		}

		// System.out.printf("게임을 시작합니다.\n");
		// System.out.println(random); // random 테스트
		// System.out.printf("숫자 테스트%d %d \n", umin, umax); // 숫자 테스트용

		while (true) {

			System.out.printf("숫자를 입력하세요.\n(%d~%d)\n", min, max);

			num = input.nextInt();
			/*
			 * if(min>num) { // 최소값보다 입력한 값이 작을 때
			 * System.out.printf("입력한 숫자가 최소값보다 작습니다. 다시 입력해주세요.\n\n"); continue; }
			 * if(max<num) { // 최대값보다 입력한 값이 클 때
			 * System.out.printf("입력한 숫자가 최대값보다 큽니다. 다시 입력해주세요.\n\n"); continue; }
			 */

			if (random != num) { // 숫자가 다를 때.
				if (random > num) { // 랜덤이 더 클 때
					System.out.printf("입력한 숫자가 더 작습니다.\n");
					min = num;
					min = min + 1;
					cnt++;
					continue;

				} else if (random < num) { // 랜덤이 더 작을 때
					System.out.printf("입력한 숫자가 더 큽니다.\n");
					max = num;
					max = max - 1;
					cnt++;
					continue;

				}

			} else {
				System.out.printf("정답입니다! %d회에 맞췄습니다.\n", cnt);
				System.out.printf("게임을 다시 진행하시겠습니까?(Y/N)\n");

				yn = input.next().charAt(0); // char n글자 따기 : .next().charAt(n);

				if ((yn == 'Y') || (yn == 'y')) {

					random = (int) (Math.random() * 90 + 10); // 다시 랜덤하게.
					cnt = 0; // 카운트 초기화
					min = 10; // 최소값 초기화
					max = 99; // 최대값 초기화
					System.out.printf("게임을 다시 진행합니다...\n\n\n");
					System.out.printf("게임을 시작합니다.\n");

					continue;

				} else if ((yn == 'N') || (yn == 'n')) {
					// random = (int)(Math.random()*90+10); // 다시 랜덤하게. 굳이?
					// cnt = 0; // 카운트 초기화
					System.out.printf("게임이 종료됩니다...\n");
					break;
				}
			}
		} // while 종료
	}

}