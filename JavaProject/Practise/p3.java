
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다음의 연산 결과를 적으시오
		/*
		 * int x = 2; int y = 5; char c = 'A'; // 'A' 의 문자코드는 65 System.out.println(1 +
		 * x << 33); // 6 System.out.println(y >= 5 || x < 0 && x > 2); // true
		 * System.out.println(y += 10 - x++); // 13 System.out.println(x += 2); // 5
		 * System.out.println(!('A' <= c && c <= 'Z')); // false System.out.println('C'
		 * - c); // 2 System.out.println('5' - '0'); // 5 System.out.println(c + 1); //
		 * 66 System.out.println(++c); // B System.out.println(c++);// B
		 * System.out.println(c); // C
		 */

		// [3-2]아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
		// 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
		// (1)에 알맞은 코드를 넣으시오.

		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples + 9) / sizeOfBucket); // 모든 사과를 담는데 필요한 바구니의수
		/*
		 * int numOfBucket = (numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket
		 * == 0 ? 0 : +1)); // 모든 사과를 담는데 필요한 바구니의 수
		 */
		System.out.println(" :" + numOfBucket);
	}

}
