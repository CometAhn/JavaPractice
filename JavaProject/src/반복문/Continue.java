package 반복문;
import java.util.*;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue를 이용하여 1~100까지 홀수의 합.		
/*		int i = 1;
		int sum= 0;
		
		for(i=1;i<=100;i++) {
			
			if(i%2==0) {
				continue; // 처음으로 돌아가.
			}else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
*/		
		// 1~10까지 숫자 중에서 홀수 값만 출력 하시오(continue 사용.)
/*		int i = 0;
		for(i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.printf("%2d,",i);
			
		}*/
/*
		int money = 10000;
		System.out.println("현재가진돈은 "+money+"입니다."); // 현재 가진돈은 10000
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("얼마를 사용하시겠습니까?");
			int i = sc.nextInt();
			
			if(!(0<=i && i<= money)) { // (돈이 0원많고 작고 가진 돈다 크다)부정 ->  0>숫자 ~ 가진돈<숫자, 일 경우
				System.out.println("다시 입력해주세요(사용범위가 틀렸습니다.)");
				continue; // while로 돌아감.
			}
			
			System.out.printf("이제 %d원이 남았습니다. \n", money -= i); // money - i 프린트
			if(money == 0) { // money가 0이 될 경우 조건문에서 나간다.
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다. 종료"); // 조건문에서 나간다 = money가 0이 될 경우
*/

	}

}
