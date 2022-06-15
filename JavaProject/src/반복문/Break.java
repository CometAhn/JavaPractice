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
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("중단 하고자 하는 숫자 입력 : ");
		
		int i = input.nextInt();
		
		while(true) {
			
			System.out.println(num);
			num++;
			
			if(num==i)

				//System.out.printf("%d에서 중단되었습니다.",num);
				break;
		}
		System.out.printf("%d에서 중단되었습니다.",num);
	}

}
