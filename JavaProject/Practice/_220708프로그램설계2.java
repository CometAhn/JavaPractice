public class _220708프로그램설계2 {

	public static void main(String[] args) {

		// 문제1. 한 학생의 평점에 따라 장학금의 종류를 출력하는 프로그램을 설계한 후 작성하라. 평점에 따른 장학금의 종류는 다음과 같다.
		// - 평점이 4.3 이상이면 전액 장학금이다.
		// - 평점이 4.0 이상이고 4.3 미만이면 방액 장학금이다.
		// - 평점이 3.7 이상이고 4.0 미만이면 방액 장학금이다.
		// - 평점이 3.7 미만이면 장학금을 받을 수 없다.
		// 학생의 평점은 키보드로부터 입력 받아야 한다.

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * while (true) {
		 * 
		 * System.out.print("평점을 입력하세요. : "); float grade = sc.nextFloat();
		 * 
		 * if (!(grade >= 0 && grade <= 4.5)) {
		 * System.out.println("평점은 0.0 ~ 4.5점 사이입니다."); continue; }
		 * 
		 * if (grade >= 4.3) { System.out.println("전액 장학금입니다."); break; } else if (grade
		 * >= 4.0) { System.out.println("모범 장학금입니다."); break; } else if (grade >= 3.7) {
		 * System.out.println("반액 장학금입니다."); break; } else {
		 * System.out.println("장학금을 받을 수 없습니다."); break; } }
		 */

		// 문제2. 한 과목의 학점 부여 기준은 다음과 같다.
		// - 학기중 과제나 시험에서 부정행위가 있으면 학점은 'F'이다.
		// - 학기중 출석률이 80% 미만이면 학점은 'F'이다.
		// - 학기중 출석률이 80% 이상이고 총점이 90점 이상이면 학점은 'A' 이다.
		// - 학기중 출석률이 80% 이상이고 총점이 80점 이상이고 90점 미만이면 학점은 'B' 이다.
		// - 학기중 출석률이 80% 이상이고 총점이 70점 이상이고 80점 미만이면 학점은 'C' 이다.
		// - 학기중 출석률이 80% 이상이고 총점이 60점 이상이고 70점 미만이면 학점은 'D' 이다.
		// - 학기중 출석률이 80% 이상이고 총점이 60점 미만이면 학점은 'F' 이다.
		//
		// 이 과목을 수강하는 한 학생의 부정행위 여부, 출석률과 총점을 입력 받아 학점을 부여하고 출력하는 완전한 프로그램을 설계하고 작성하라.
		//
		// 다음은 모범 출력이다.
		//
		// 부정행위 여부(true 혹은 false): false
		// 출석률(0 ~ 100 사이의 정수값): 89
		// 총점(0 ~ 100 사이의 정수값): 75
		// 학점 = C
		//

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * while (true) { System.out.print("부정행위 여부(true 혹은 false) : "); boolean cheat =
		 * sc.nextBoolean();
		 * 
		 * System.out.print("출석률(0 ~ 100 사이의 정수값) : "); int attendanceRate =
		 * sc.nextInt();
		 * 
		 * if (!(attendanceRate >= 0 && attendanceRate <= 100)) {
		 * System.out.println("출석률은 0 ~ 100 사이의 값을 입력하세요."); continue; }
		 * 
		 * System.out.print("총점(0 ~ 100 사이의 정수값) : "); int score = sc.nextInt();
		 * 
		 * if (!(score >= 0 && score <= 100)) {
		 * System.out.println("출석률은 0 ~ 100 사이의 값을 입력하세요."); continue; }
		 * 
		 * char grade = '0';
		 * 
		 * if (score >= 90) { grade = 'A'; } else if (score >= 80) { grade = 'B'; } else
		 * if (score >= 70) { grade = 'C'; } else if (score >= 60) { grade = 'D'; } if
		 * (cheat == true || attendanceRate < 80 || score < 60) { grade = 'F'; }
		 * System.out.println("학점 : " + grade); break; }
		 */
		// 문제3. 입력 받은 양의 정수가 3의 배수, 5의 배수 혹은 8의 배수인지를 알려주는 프로그램을 설계하고 작성하라. 양의 정수가 3의
		// 배수이면 '3의 배수이다'를
		// 출력하고 5의 배수이면 '5의 배수이다'를 출력하며 8의 배수이면 '8의 배수이다'를 출력하고 그 외의 경우이면 '어느 배수도 아니다'를
		// 출력하라.

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("정수를 입력하세요. : "); int
		 * num = sc.nextInt(); String str = "";
		 * 
		 * while (true) { if (num % 3 == 0) { str += " 3"; } if (num % 5 == 0) { str +=
		 * " 5"; } if (num % 8 == 0) { str += " 8"; } if (str == "") {
		 * System.out.println(num + "은 3, 5, 8의 배수가 아니다."); break; } str =
		 * str.substring(1, str.length()); // 제일 앞자리 띄어쓰기 제거. str = str.replace(" ",
		 * ", "); // 띄어쓰기는 , 으로 변경.
		 * 
		 * System.out.printf("%d은 %s의 배수이다", num, str); break;
		 * 
		 * }
		 */

		// 문제4. 할인점에서 고객에게 청구 금액을 계산하는 프로그램을 설계하고 작성하라. 고객이 30만원 이상 구매하면 3만원을 할인해 주어야 하고
		// 30만원 미만 10만원
		// 이상을 구매하면 5,000원을 할인해 주어야 하며 10만원 미만을 구매하면 할인이 없어야 한다. 키보드로부터 구매 금액을 입력 받아야
		// 한다. 구매 금액과 청구 금액을
		// 출력해야 한다.

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("구매 금액을 입력하세요. : ");
		 * int money = sc.nextInt(); int sale = 0;
		 * 
		 * if (money >= 300000) { sale = 30000; } else if (money >= 100000) { sale =
		 * 5000; } System.out.println("구매 금액 : " + money); System.out.println("청구 금액 : "
		 * + (money - sale));
		 */

		// 문제5. 한 직장인의 연간 근로소득에 대한 소득세를 계산하는 프로그램을 설계하고 작성하라. 근로소득에 대한 소득세는 다음과 같다.
		// - 근로소득이 2,000만원 이하이면 근로소득의 5%이다.
		// - 근로소득이 2,000만원을 초과하고 4,000만원 이하이면 근로소득의 15%이다.
		// - 근로소득이 4,000만원을 초과하고 8,000만원 이하이면 근로소득의 25%이다.
		// - 근로소득이 8,000만원을 초과하면 근로소득의 40%이다.
		// 연간 근로소득은 입력받아야 한다.

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("연간 근로소득을 입력하세요. : "); int ym = sc.nextInt(); float tax =
		 * 0; if (ym > 8000) { tax = (float) (ym * 0.4); } else if (ym > 4000) { tax =
		 * (float) (ym * 0.25); } else if (ym > 2000) { tax = (float) (ym * 0.15); }
		 * else { tax = (float) (ym * 0.05); } System.out.println("연간근로소득 : " + ym);
		 * System.out.println("소득세 : " + tax);
		 */

		// 문제6. 할인점에서 가격이 100,000원인 한 제품을 판매한다. 그 제품을 10개 이상 사는 고객에게 10%를 할인해 준다. 고객이
		// 구입한 그 제품의 수량을 입력하면
		// 총 가격을 계산하는 프로그램을 설계하고 작성하라.

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("제품 구매 개수를 입력하세요.");
		 * int cnt = sc.nextInt(); int pay = 0; if (cnt >= 10) { pay = (int) (cnt *
		 * 100000 * 0.9); } else { pay = cnt * 100000; } System.out.println("가격 : " +
		 * pay);
		 */

		// 문제7. 영화관에서 상영중인 영화에 대해 고객 나이가 19세 이상이면 "영화를 볼 수 있습니다"를 출력하고 나이가 19세 미만이고 15세
		// 이상이면 "성인이 동반한
		// 경우에만 영화를 볼 수 있습니다"를 출력하고 나이가 15세 미만이면 "영화를 볼 수 없습니다"를 출력하는 프로그램을 설계하고 작성하라.

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("나이를 입력하세요. : "); int
		 * age = sc.nextInt();
		 * 
		 * System.out.println(age >= 19 ? "영화를 볼 수 있습니다." : age >= 15 ?
		 * "성인이 동반한 경우에만 영화를 볼 수 있습니다." : "영화를 볼 수 없습니다.");
		 */

		// 문제8. 당신은 리조트에서 아래와 같이 날씨에 따라 손님들에게 적절한 활동들을 제안하는 프로그램을 설계하고 작성하라.
		// - 온도가 25도 이상이면 수영
		// - 온도가 15도 이상이고 25도 미만이면 테니스
		// - 온도가 5도 이상이고 15도 미만이면 골프
		// - 온도가 5도 미만이면 스키
		// 프로그램은 사용자로부터 온도를 입력 받아 그 온도에 적절한 활동을 출력한다. 온도는 정수 값이라고 가정한다. 다음은 모범 출력이다.
		// 힌트 : 중첩된 조건문을 사용하라. 조건문의 조건들을 필요한 것보다 더 복자하지 않도록 유의하라.
		//
		// 출력
		// 온도를 입력하세요: 23
		// 테니스를 하기에 적절한 날씨입니다.

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("온도를 입력하세요. : "); int
		 * temp = sc.nextInt(); String str = "";
		 * 
		 * if (temp >= 25) { str = "수영을 "; } else if (temp >= 15) { str = "테니스를 "; }
		 * else if (temp >= 5) { str = "골프를 "; } else { str = "스키를 "; }
		 * System.out.println(str + "하기에 적절한 날씨입니다.");
		 */

	}

}
