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
		 * int number = 1; int a = 0; int b = 0; int sum = 0; int cnt = 0; while (true)
		 * {
		 * 
		 * number++; if (sum <= 100) { if (number % 2 == 0) { cnt++; a = number; sum +=
		 * a; } else { cnt++; b = number; sum -= b; } } else { break; } }
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
		 * System.out.print("*"); j++; continue; } i++; System.out.println(); j = 0; }
		 * else { break; } }
		 */

		// [4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는
		// 프로그램을 작성하시오.
		/*
		 * for (int i = 1; i <= 6; i++) { for (int j = 1; j <= 6; j++) { int sum = i +
		 * j; if (sum == 6) { System.out.printf("%d + %d = 6\n", i, j); } } }
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
		 * int sum; for (int x = 0; x <= 10; x++) { for (int y = 0; y <= 10; y++) { sum
		 * = (2 * x) + (4 * y); if (sum == 10) { System.out.printf("x=%d, y=%d\n", x,
		 * y); }
		 * 
		 * } }
		 */

		// [4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는
		// 코드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이
		// 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		// [Hint] String클래스의 charAt(int i)을 사용
		/*
		 * 모르겠음! String str = "12345"; int sum = 0; for (int i = 0; i < str.length();
		 * i++) { sum += str.charAt(i); // ? 왜 255가 나오지 } System.out.println("sum=" +
		 * sum); System.out.println(str.charAt(0) + str.charAt(1)); // 뭐가 문제지
		 */

		// [4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		// 완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
		// (1)에 알맞은 코드를 넣으시오.
		// [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다
		// charAt X
		// 몰?루
		/*
		 * int num = 12345; int sum = 0;
		 * 
		 * for (int i = 1; i <= num; i++) { // num 숫자 길이를 Z떡계 구하지?
		 * 
		 * System.out.print(num); // sum += something;
		 * 
		 * } System.out.println("sum=" + sum);
		 */

		// [4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
		// 는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
		// 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
		// 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		// [실행결과]
		// 1,1,2,3,5,8,13,21,34,55

		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		/*
		 * int num1 = 1; int num2 = 1; int num3 = 0; // 세번째 값 System.out.print(num1 +
		 * ", " + num2); for (int i = 0; i < 8; i++) { num3 = num1 + num2; num2 = num1;
		 * num1 = num3; System.out.printf(", %d", num3);
		 * 
		 * }
		 */

		/*
		 * // [4-12] 구구단의 일부분을 다음과 같이 출력하시오. // [실행결과] // 2*1=2 3*1=3 4*1=4 // 2*2=4
		 * 3*2=6 4*2=8 // 2*3=6 3*3=9 4*3=12 // 5*1=5 6*1=6 7*1=7 // 5*2=10 6*2=12
		 * 7*2=14 // 5*3=15 6*3=18 7*3=21 // 8*1=8 9*1=9 // 8*2=16 9*2=18 // 8*3=24
		 * 9*3=27 /* for (int i = 2; i < 10; i++) { for (int j = 1; j < 4; j++) {
		 * 
		 * System.out.printf("\t%d * %d = %d\n", i, j, i * j); } }
		 * 
		 */
		// [3-3] num의 값에 다라 양수, 음수, 0을 출력하는 코드 만들기, 삼항 연산자 이용
		// int num = 10;
		// System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수");

		// [3-4] 456이라면 400이 되야함. 111이라면 100
		// int num = 456;
		// System.out.println(num / 100 * 100);

		// [3-5] 1의 자리를 1로 바꾸는 코드.
		// 333이라면 331, 777이라면 771
		// int num = 333;
		// System.out.println(num / 10 * 10 + 1);

		// [3-6] num값보다 크면서 가장 가까운 10의 배수에서 num값을 뺀 나머지 구하는 코드
		// num이 24라면 30-20이어야한다.{
		// int num = 24;
		// System.out.println(((num + 9) / 10 * 10) - num);

		// [3-7] C = 5/9 * (F - 32) 셋째자리에서 반올림할 것 틀림!
		// int fahrenheit = 100;
		// float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		// (int)((5/9f * (fahrenheit - 32))*100+ 0.5) / 100f
		// System.out.println("Fahrenheit:" + fahrenheit);
		// System.out.println("Celcius:" + celcius);

		char ch = 'A';
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? ((char) (ch + 32)) : ch;
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase:" + lowerCase);
	}
}