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
		Scanner in = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while(answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = in.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.", ++count);
				
			}
		}
		System.out.println("재생종료");
		
	}

}
