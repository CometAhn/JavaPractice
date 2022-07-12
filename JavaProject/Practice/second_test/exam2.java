package second_test;
// 문항2. 다음의 프로그램에서 빈곳을 입력하여 프로그램을 완성 하시오.프로그램 실행은 main 함수에서 실행하여 sub 클래스의 함수를
// 호출한 후 결과값을 반환하는 프로그램이다. 함수 호출시 반드시 메인함수의 변수를 활용하여 프로그램을 완성 하시오.(각 5점 /25점)

class sub {
	/* (1)___ */int calculator( /* (2)____, _____ */int a, int b) {
		int result = a + b;
		// (3)_____ (4)______;
		return result;
	}
}

public class exam2 {
	public static void main(String[] args) {

		int first = 10;
		int second = 20;

		sub sb = new sub();

		int result = sb.calculator(first, second);/* (5)__________ ; */
		System.out.println("출력결과는 : " + result + "입니다");
	}
}