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
	}
}
