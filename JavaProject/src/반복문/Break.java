package 반복문;
import java.util.*;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// break문 활용,(조건문 탈출)
/*		int i=1;
		while(i<=10) {
			
			if(i == 8) {
				
				break;
				
			}
			System.out.printf("%2d,",i++);
			
		}
*/		
		// 중단하고자 하는 숫자 입력 : n에서 충력이 중단되었습니다.
/*		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("중단 하고자 하는 숫자 입력 : ");
		
		int i = input.nextInt();
		
		while(true) {
			
			System.out.println(num);
			num++;
			
			if(num==i)

				break;
		}
		System.out.printf("%d에서 중단되었습니다.",num);
*/
/*	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		
		while(true) {
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");
			
			i = sc.nextInt();
			if(i==0) {
				break;
			}
			
			sum+= i;
			
		}
		System.out.println("현재까지 총합 = " + sum);
*/

	
		// 점수를 계속 입력 받다가 0이 입력되면 입력된 수의 개수, 합계, 평균을 출력하는 프로그램을 작성하시오.(p.67 참고)
/*		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		int count = 0;
		
		while(true) {
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");
			
			i = sc.nextInt();
			if(i==0) {
				break;
			}
			
			sum+= i;
			count++;
			
		}
		//System.out.println("현재까지 총합 = " + sum);
		System.out.println("입력된 수의 개수 = " + count);
		System.out.println("입력된 수의 합계 = " + sum);
		System.out.println("입력된 수의 평균 = " + sum/count);
*/
		// 위 문제를 참고하여 정수를 계속 입력 받다가 0이 입력되면 입력된 수들 중에서 홀수의 합계, 홀수의 평균을 출력하는 프로그램을 작성하시오
		// 입력 데이터 5, 8, 17, 6, 31, 0
		// 출력 
		// 홀수의 합 = 53
		// 홀수의 평균 = 17
	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		int count = 0;
		int odd = 0;
		int oddsum = 0;
		int oddcount = 0;
		
		while(true) {
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");


			i = sc.nextInt();
			
			if(i==0) {
				break;
			}
			
			if(i%2==1) {
				odd++;	
				oddsum+= i;
				oddcount++;
			}
			
			sum+= i;
			count++;
			
		}
		if(odd==0)
		{
			System.out.println("홀수가 입력되지 않았습니다.");
		}
		else {

			System.out.println("입력된 홀수의 개수 = " + oddcount);
			System.out.println("입력된 홀수의 합계 = " + oddsum);
			System.out.println("입력된 수의 평균 = " + oddsum/oddcount);
		}
	
	}
}
