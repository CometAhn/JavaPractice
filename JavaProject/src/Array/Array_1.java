package Array;

import java.util.*;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int[] student = new int[3];
		System.out.println("현재 자동으로 초기화 된 값:"+ student[0]);
		
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		System.out.println("현재 첫 번째 요소의 값 = "+ student[2]);
		*/
	/*	
		//길이가5인 배열 생성, 배열 길이 생략
		int[] a = new int[] {10,20,4,25,18};
		
		//길이가 7인 배열 생성 new int는 생략 가능.
		int[] b = {1,2,3,4,5,6,7};
		
		// for문으로 배열 초기화
		int[] c = new int[10]; // 배열 길이를 10으로
		for(int i=0;i<c.length;i++) {
			c[i]=i;
		}
		
		// for문을 이용한 출력
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}

		System.out.println("");
		System.out.println(Arrays.toString(c));
		*/
		
		//시험점수 평균 구하기
		int[] student = {100, 95, 90, 88, 93};
		int sum = 0;
		for(int i=0;i<student.length;i++) {
			sum += student[i];
		}
		
		System.out.println("시험점수의 평균 : " + sum/(float)student.length);
			
		
	}

}
