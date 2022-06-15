import java.util.*;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~100 총합
/*
 		int i = 1;
 
		int sum = 0;
		
		while(i<=100) {
			sum+=i;
			i++;
			
		}
		
		System.out.printf("1에서 100가지의 합은 %d이다.", sum );
*/
		//Y,y 일 때, 반복.
/*		Scanner in = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while((answer.equals("Y"))||(answer.equals("y"))) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = in.nextLine();
			
			if((answer.equals("Y"))||(answer.equals("y"))) {
				System.out.printf("음악을 %d번 재생했습니다.", ++count);
				
			}
		}
		System.out.println("재생종료");
*/
		// 원하는 숫자까지 1++
/*		
		Scanner input = new Scanner(System.in);
		int i = 1;
		System.out.printf("숫자를 입력하세요.");
		int want = input.nextInt();
		
		while(i<=want) {
			System.out.printf("%5d",i++);
		}
*/			
		
		//구구단 i단(a * b)=output
		int a = 2;
		while(a < 10) {
			int b = 1;
			
			while(b < 10) {
				System.out.printf("%3d*%d = %2d,",a, b,a*b);
				b++;
			}
			System.out.printf("\n");
			a++;
		}
			
		
		
	}

}
