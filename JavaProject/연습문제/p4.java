
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
		// ������ for���� while������ �����Ͻÿ�.
		// for (int i = 0; i <= 10; i++) {
		// for (int j = 0; j <= i; j++)
		// System.out.print("*");
		// System.out.println();
		// }
		int i = 0;
		int j = 0;
		while (true) {
			if (i <= 10) {
				if (j <= i) {
					System.out.print("*");
					j++;
					continue;
				}
				i++;
				System.out.println();
				j = 0;
			} else {
				break;
			}
		}
	}
}
