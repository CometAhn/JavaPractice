package Pointer;
import java.util.*;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	//시험점수 평균 구하기
		int[] student = {100, 95, 90, 88, 93};
		int sum = 0;
		for(int i=0;i<student.length;i++) {
			sum += student[i];
		}
		
		System.out.println("시험점수의 평균 : " + sum/(float)student.length);
	*/	
		
		// 배열 이용. 배열 길이가 5(int scores)
		// 사용자가 5번 입력한 숫자의 합과 평균을 구하기
/*		Scanner in = new Scanner(System.in);

		
		int[] scores = new int[5];
		int sum = 0;
		int i;
		
		for(i=0;i<scores.length;i++) {

			System.out.printf("입력할 값");
			scores[i] = in.nextInt();
			sum+= scores[i];
		}

		System.out.printf("\n합계 : %d\n",sum);
	
		System.out.printf("평균 : %s",sum/(float)scores.length);
*/
		
		// 1. 학생수를 입력해서 학생 수 만큼 성적을 입력하여 학생들의 총합과 학생들의 평균값을 출력하시오.
		// 2. 성적 입력시 0미만이거나 100초과인 경우 데이터를 다시 입력 받을 수 있게 처리하시오.
		// 학생수 배열
		// 점수 배열
		Scanner input = new Scanner(System.in); // 스캐너 생성
		
		int stunum = 0; // 학생수 배열 수 만들기용
		
		System.out.println("학생수는 몇 명입니까?");
		stunum = input.nextInt();	
		
		int[] scores = new int[stunum]; // 점수들 수
		int sum = 0; // 합계
		int i; 
		int min=0; // 최소값
		int max=100; // 최대값
		
		for(i=0;i<stunum;i++) {
			System.out.println("점수는 몇점입니까??");	
			scores[i] = input.nextInt(); // 각 학생의 점수.
			
			if((min>scores[i])||(max<scores[i])) {
				System.out.printf("데이터가 너무 크거나 작습니다. 다시 입력하세요\n");
				i--; // 카운트 다시 1 빼기.
				continue;
				}
			else {
				sum += scores[i]; // sum = 점수 총합.
				
			}
		}
		System.out.printf("점수 총합 :  %d\n",sum);
		System.out.printf("점수 평균 :  %.1f",(float)sum/stunum);
			
	}

}
