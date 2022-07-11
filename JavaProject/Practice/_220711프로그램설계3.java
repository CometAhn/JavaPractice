import java.util.Scanner;

public class _220711프로그램설계3 {

	public static void main(String[] args) {

//		문제1. 직원의 연봉과 근무평가등급을 입력 받아 연봉 인상금액과 새 연봉을 계산하여 출력하는 프로그램을 설계하고 작성하라. 직원의 근무평가등급은 우수, 보통과 불량 중 하나이다.
//		1(우수) 등급을 받은 직원은 연봉이 6% 인상되고 2(보통) 등급을 받은 직원은 연봉이 4% 인상되며 3(불량) 등급을 받은 직원은 연봉이 2% 인상된다. 다음은 프로그램의 모범 출력이다.
//
//		출력
//		현 연봉을 입력하세요 : 2400
//		근무 평가등급을 입력하세요 : 1
//		연봉 인상액 : 144.0
//		새 연봉 : 2544.0
//		변수
		// pay, grade, increase
//		알고리즘

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("현 연봉을 입력하세요. : "); int
		 * pay = sc.nextInt(); System.out.print("근무 평가 등급을 입력하세요. : "); int grade =
		 * sc.nextInt(); float increase = 0;
		 * 
		 * if (grade == 1) { increase = (float) (pay * 0.06); } else if (grade == 2) {
		 * increase = (float) (pay * 0.04); } else if (grade == 3) { increase = (float)
		 * (pay * 0.02); } System.out.println("연봉 인상액 : " + increase);
		 * System.out.println("새 연봉 : " + (increase + pay));
		 */

		// 문제2. 남성들과 여성들의 이상적인 체중을 계산하는 프로그램을 설계하고 작성하라. 한 연구에 따르면 여성의 이상적인 체중은 다음과 같이
		// 계산된다.
		// - 신장이 150cm를 초과한다면 (37.8 + 0.75 * (신장 - 150))kg이다.
		// - 신장이 150cm 이하라면 37.8 kg 이다.
		// 예를 들면 신장이 158인 여성의 이상적인 체중은 37.8 + 0.75 * 8 = 43.8kg이다. 남성의 이상적인 체중은 다음과 같이
		// 계산된다.
		// - 신장이 150cm를 초과한다면 (40 + 0.89 * (신장 - 150))kg이다.
		// - 신장이 150cm 이하라면 40 kg 이다.
		// 예를 들면 신장이 175cm인 남성의 이상적인 체중은 40 + 0.89 * 25 = 62.25kg 이다. 프로그램은 사용자로 부터 한
		// 여성의 신장과 한 남성의 신장을 각각 입력 받아야 한다. 그 다음에 그 여성의 이상적인 체중과 그 남성의 이상적인 체중을 계산한 후
		// 출력해야 한다. 프로그램을 작성하기에 앞서 설계를 하라. 다음은 프로그램의 모범 출력이다.
		// 출력
		// 여성의 신장을 입력하세요: 158
		// 남성의 신장을 입력하세요: 175
		// 여성의 이상적인 체중은 43.8이다.
		// 남성의 이상적인 체중은 62.25이다.
		//
		// 변수
		// female, male, fw8, mw8
		// 알고리즘

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("여성의 신장을 입력하세요. : ");
		 * int female = sc.nextInt(); System.out.print("남성의 신장을 입력하세요. : "); int male =
		 * sc.nextInt(); float fw8 = (float) 37.8; float mw8 = 40;
		 * 
		 * if (female > 150) { fw8 = (float) (37.8 + 0.75 * (female - 150)); }
		 * 
		 * if (male > 150) { mw8 = (float) (40 + 0.89 * (male - 150)); }
		 * System.out.printf("여성의 이상적인 체중은 " + fw8 + "이다.\n");
		 * System.out.printf("남성의 이상적인 체중은 " + mw8 + "이다.\n");
		 */

		// 문제3. 주어진 연도가 윤년인지 아닌지를 출력하는 프로그램을 설계하고 작성하라.
		// 한 연도가 4로 나누어지고 100으로 나누어지지 않으면 그 연도는 윤년이다.
		// 예를 들면 1796년은 1796이 4로 나누어지고 100으로 나누어지지 않으므로 윤년이다.
		// 또한 한 연도가 4로 나누어지고 100으로 나누어질 뿐만 아니라 400으로도 나누어지면 그 연도는 윤년이다.
		// 예를 들면 2000년은 윤년이나 1800년은 윤년이 아니다. 프로그램은 "연도를 입력하세요: "라는 메시지를 출력한 후 연도를 입력 받아야
		// 한다.
		// 그리고 연도가 윤년이면 "XXXX년은 윤년입니다"를 출력하고 아니면 "XXXX년은 윤년이 아닙니다"를 출력해야 한다.
		// 여기서 XXXX는 입력 받은 연도이다.

		// 변수
		// year
		// 알고리즘

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("연도를 입력하세요. : "); int
		 * year = sc.nextInt();
		 * 
		 * if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		 * System.out.println(year + "년은 윤년입니다."); else System.out.println(year +
		 * "년은 윤년이 아닙니다.");
		 */

		// 문제4. 신용카드 회사의 고객에게 매월 보내지는 카드 이용대금 명세서를 작성하는 프로그램을 설계하고 작성하라. 프로그램은 이전
		// 잔고(미결제금액)과 당월 사용금액을 입력으로 받아야 한다. 그 다음으로 연체이자, 새 잔고(입금해야 할 총 금액)과 최소 입금액을 계산해야
		// 한다. 이전 잔고가 0보다 크다면 연체이자는 이전 잔고와 당월 사용 금액의 합의 2%이다. 최소 입금액은 다음과 같이 계산된다.
		// - 새 잔고가 100,000원보다 작으면 최소 입금액은 새 잔고이다.
		// - 새 잔고가 100,000원보다 크거나 같고 300,000원보다 작거나 같으면 최소 입금액은 100,000원이다.
		// - 새 잔고가 300,000원보다 크다면 최소 입금액은 새 잔고의 20%이다.
		// 예를 들면 새 잔고가 58,000원이라면 고객은 58,000원 전부를 입금해야 한다. 새 잔고가 172,000원이라면 최소 입금액은
		// 100,000원이다. 새 잔고가 649,000원이라면 최소 입금액은 649,000원 * 0.2 = 129,800원이다. 프로그램은 다음과
		// 같은 포맷으로 당월 카드 이용대금 명세서를 출력해야 한다.
		//
		// 당원 카드 이용대금 명세서
		//
		// 미결제 금액 : XXXXX원
		// 당월 사용금액 : XXXXXXX원
		// 연체 이자 : XXXX원
		//
		// 입금해야 할 총금액 : XXXXXXX원
		// 최소 입금액 : XXXXX원

		Scanner sc = new Scanner(System.in);
		System.out.printf("미결제 금액 : ");
		int nonchecked = sc.nextInt(); // 이전 잔고(미결제금액)
		System.out.printf("당월 사용금액 : ");
		int month = sc.nextInt(); // 당월 사용금액

		System.out.printf("\n\n\n\n\n\n\n\n\n", month);
		System.out.println("\t당월 카드 이용대금 명세서\n");
		System.out.printf("미결제 금액 :\t\t %10d원\n", nonchecked);
		System.out.printf("당월 사용금액 :\t\t %10d원\n", month);

		int interest = 0;

		if (nonchecked > 0) { // 이전 잔고가 0보다 크면
			interest = (int) ((nonchecked + month) * 0.02); // 연체이자는 이러하다.
		}

		int allpay = nonchecked + month + interest;
		int almost = 0;

		if (allpay > 300000) {
			almost = (int) (allpay * 0.2);
		} else if (allpay > 100000) {
			almost = 100000;
		} else {
			almost = allpay;
		}

		if (interest != 0) {
			System.out.printf("연체 이자 :\t\t %10d원\n\n", interest);
		}
		System.out.printf("입금해야할 총 금액 :\t %10d원\n", allpay);
		System.out.printf("최소 입금액 :\t\t %10d원\n\n\n", almost);

	}

}
