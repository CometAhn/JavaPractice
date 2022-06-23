package Loop;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 1~100 홀수 누적, 2. 누적된 값이 1000미만까지 최종합과 i의 값 구하기.
		int i = 0;
		int i1 = 0;
		int sum = 0;
		int sum1 = 0;

		for (i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum += i;

				if (sum < 1000) {
					sum1 += i;
					i1 = i;
				}
			}
		}

		System.out.printf("1에서 100 중, 홀수 총합이 1000미만일 때의 최종합은 %d이고 그 때 i는 %d이다.", sum1, i1);
	}

}