public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [4-1] ������ ������� ���ǽ����� ǥ���϶�.
		// 1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		// if (x > 10 && 20 > x) ;
		// 2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
		// if (!(ch == '\0' || ch == '\t'))
		// 3. char�� ���� ch�� ��x' �Ǵ� ��X'�� �� true�� ���ǽ�
		// if(x='x'||'X');
		// 4. char�� ���� ch�� ����(��0��~��9��)�� �� true�� ���ǽ�
		// if(ch>='0'&&ch<='9');
		// 5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
		// if((char>='a'&&char<='z')||(char>='A'&&char>='Z'));
		// 6. int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100���� ������������
		// ���� �� true�� ���ǽ�
		// if((year%400==0)||((year%4==0)&&(year%100!=0)))
		// 7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
		// if(powerOn==flase);
		// 8. ���ڿ� �������� str�� ��yes���� �� true�� ���ǽ�
		// if(str="yes");

		// [4-2] 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		// int sum = 0;
		// int three;
		// for (int i = 0; i <= 20; i++) {
		// if ((i % 2 == 0 || i % 2 == 0)) {
		// // System.out.println(i);
		// sum += i;
		// }
		// }
		// System.out.println(sum);

		// 4-3 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
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

		// 4-4. 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ���
		// ���Ͻÿ�.
		/*
		 * int number = 1; int a = 0; int b = 0; int sum = 0; int cnt = 0; while
		 * (true) {
		 * 
		 * number++; if (sum <= 100) { if (number % 2 == 0) { cnt++; a = number;
		 * sum += a; } else { cnt++; b = number; sum -= b; } } else { break; } }
		 * System.out.println(cnt);
		 */
		// 4.5������ for���� while������ �����Ͻÿ�.
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

		// [4-6] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		/*
		 * for (int i = 1; i <= 6; i++) { for (int j = 1; j <= 6; j++) { int sum
		 * = i + j; if (sum == 6) { System.out.printf("%d + %d = 6\n", i, j); }
		 * } }
		 */

		// [4-7] Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� �����ϴ�
		// �ڵ带 �ϼ��϶�. (1)�� �˸��� �ڵ带 �����ÿ�.
		/*
		 * int value = (int) (Math.random() * 6) + 1; // 1~10������ ����.
		 * System.out.println("value:" + value);
		 */

		// [4-8] ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������
		// 0<=x<=10, 0<=y<=10 �̴�.
		/*
		 * int sum; for (int x = 0; x <= 10; x++) { for (int y = 0; y <= 10;
		 * y++) { sum = (2 * x) + (4 * y); if (sum == 10) {
		 * System.out.printf("x=%d, y=%d\n", x, y); }
		 * 
		 * } }
		 */

		// [4-9] ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ�
		// �ڵ带 �ϼ��϶�. ���� ���ڿ��� "12345"���, ��1+2+3+4+5���� ����� 15�� �����
		// ��µǾ�� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�.
		// [Hint] StringŬ������ charAt(int i)�� ���
		/*
		 * �𸣰���! String str = "12345"; int sum = 0; for (int i = 0; i <
		 * str.length(); i++) { sum += str.charAt(i); // ? �� 255�� ������ }
		 * System.out.println("sum=" + sum); System.out.println(str.charAt(0) +
		 * str.charAt(1)); // ���� ������
		 */

		// [4-10] intŸ���� ���� num �� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带
		// �ϼ��϶�. ���� ���� num�� ���� 12345���, ��1+2+3+4+5���� ����� 15�� ����϶�.
		// (1)�� �˸��� �ڵ带 �����ÿ�.
		// [����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�
		// charAt X
		// ��?��
		/*
		 * int num = 12345; int sum = 0;
		 * 
		 * for (int i = 1; i <= num; i++) { // num ���� ���̸� �Z���� ������?
		 * 
		 * System.out.print(num); // sum += something;
		 * 
		 * } System.out.println("sum=" + sum);
		 */
		// [4-11] �Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ����
		// �� �����̴�. ���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ����
		// 1�� 2�� ���ؼ� 3�� �Ǿ 1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 1�� 1����
		// �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		// [������]
		// 1,1,2,3,5,8,13,21,34,55

		// Fibonnaci ������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�.
		/*
		 * int num1 = 1; int num2 = 1; int num3 = 0; // ����° ��
		 * System.out.print(num1 + ", " + num2); for (int i = 0; i < 8; i++) {
		 * num3 = num1 + num2; num2 = num1; num1 = num3;
		 * System.out.printf(", %d", num3);
		 * 
		 * }
		 */

		// [4-12] �������� �Ϻκ��� ������ ���� ����Ͻÿ�.
		// [������]
		// 2*1=2 3*1=3 4*1=4
		// 2*2=4 3*2=6 4*2=8
		// 2*3=6 3*3=9 4*3=12
		// 5*1=5 6*1=6 7*1=7
		// 5*2=10 6*2=12 7*2=14
		// 5*3=15 6*3=18 7*3=21
		// 8*1=8 9*1=9
		// 8*2=16 9*2=18
		// 8*3=24 9*3=27
		/*
		 * for (int i = 2; i < 10; i++) { for (int j = 1; j < 4; j++) {
		 * 
		 * System.out.printf("\t%d * %d = %d\n", i, j, i * j); } }
		 */
	}
}
