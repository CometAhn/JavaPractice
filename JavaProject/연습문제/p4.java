public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [4-1] 다음의 문장들을 조건식으로 표현하라.
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		// if (x > 10 && 20 > x) ;
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		// if (!(ch == '\0' || ch == '\t'))
		// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		// if(x='x'||'X');
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		// if(ch>='0'&&ch<='9');
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		// if((char>='a'&&char<='z')||(char>='A'&&char>='Z'));
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		// 않을 때 true인 조건식
		// if((year%400==0)||((year%4==0)&&(year%100!=0)))
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		// if(powerOn==flase);
		// 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		// if(str="yes");

		// [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		// int sum = 0;
		// int three;
		// for (int i = 0; i <= 20; i++) {
		// if ((i % 2 == 0 || i % 2 == 0)) {
		// // System.out.println(i);
		// sum += i;
		// }
		// }
		// System.out.println(sum);

		// 4-3 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		/*
		 * int num = 0; int numnum = 0;
		 * 
		 * for (int i = 0; i <= 10; i++) {
		 * 
		 * num += i; numnum += num++;
		 * 
		 * }
		 */
		// System.out.println(numnum);

		// 4-4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지
		// 구하시오.
		/*
		 * int number = 1; int a = 0; int b = 0; int sum = 0; int cnt = 0; while
		 * (true) {
		 * 
		 * number++; if (sum <= 100) { if (number % 2 == 0) { cnt++; a = number;
		 * sum += a; } else { cnt++; b = number; sum -= b; } } else { break; } }
		 * System.out.println(cnt);
		 */
		// 4.5다음의 for문을 while문으로 변경하시오.
		// for (int i = 0; i <= 10; i++) {
		// for (int j = 0; j <= i; j++)
		// System.out.print("*");
		// System.out.println();
		// }
		/*
		 * int i = 0; int j = 0; while (true) { if (i <= 10) { if (j <= i) {
		 * System.out.print("*"); j++; continue; } i++; System.out.println(); j
		 * = 0; } else { break; } }
		 */

		// [4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는
		// 프로그램을 작성하시오.
		/*
		 * for (int i = 1; i <= 6; i++) { for (int j = 1; j <= 6; j++) { int sum
		 * = i + j; if (sum == 6) { System.out.printf("%d + %d = 6\n", i, j); }
		 * } }
		 */

		// [4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		// 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		/*
		 * int value = (int) (Math.random() * 6) + 1; // 1~10까지는 가능.
		 * System.out.println("value:" + value);
		 */

		// [4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		// 0<=x<=10, 0<=y<=10 이다.
		/*
		 * int sum; for (int x = 0; x <= 10; x++) { for (int y = 0; y <= 10;
		 * y++) { sum = (2 * x) + (4 * y); if (sum == 10) {
		 * System.out.printf("x=%d, y=%d\n", x, y); }
		 * 
		 * } }
		 */

		// [4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는
		// 코드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이
		// 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		// [Hint] String클래스의 charAt(int i)을 사용
		/*
		 * 모르겠음! String str = "12345"; int sum = 0; for (int i = 0; i <
		 * str.length(); i++) { sum += str.charAt(i); // ? 왜 255가 나오지 }
		 * System.out.println("sum=" + sum); System.out.println(str.charAt(0) +
		 * str.charAt(1)); // 뭐가 문제지
		 */
	}
}
