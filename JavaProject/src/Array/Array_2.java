package Array;
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
		Scanner in = new Scanner(System.in);

		
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

			
	}

}
