package second_test;
import java.util.Scanner;

//문항3. 다음은 구구단을 계산하는 프로그램이다. 특정 수를 입력받아 해당하는 수의 구구단을 반복적으로 계산하고 출력하는 프로그램을 완성하시오. (각 5점/20점) import java.util.*; 
class func {
	int b;

	void gugu(int a) {
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}
	}
}

public class exam3 {
	public static void main(String[] args) {
		int dan = 0;

		func test = new func(); // (2) func클래스를 사용하기위한 부분
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 실행하시겠습니까?");
		dan = sc.nextInt(); // (3) 사용자로부터 입력받는 부분

		test.gugu(dan);
		// (4) 함수호출구문
	}
}