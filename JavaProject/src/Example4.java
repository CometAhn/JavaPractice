
public class Example4 {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = a; System.out.println(a); // 10
		 * 
		 * b += a; System.out.println(b); // 20
		 * 
		 * b = a = 10; System.out.println(b); // 10
		 * 
		 * b += a; System.out.println(b); // 20
		 * 
		 * b -= a; System.out.println(b); // 10
		 * 
		 * b *= a; System.out.println(b); // 100
		 * 
		 * b /= a; System.out.println(b); // 10
		 * 
		 * b %= a; System.out.println(b); // 0
		 * 
		 * b = a = 10;
		 * 
		 * System.out.println(b); // 10
		 * 
		 * b = b + a; System.out.println(b); // 20
		 * 
		 * b = b - a; System.out.println(b); // 10
		 * 
		 * b = b * a; System.out.println(b); // 100
		 * 
		 * b = b / a; System.out.println(b); // 10
		 * 
		 * b = b % a; System.out.println(b); // 0
		 * 
		 * int aa = 12; int bb = 4; int cc = 19;
		 * 
		 * int max = (aa > bb ? aa : bb); System.out.println(max > cc ? max : cc);
		 */

		int a = 100;
		int b = 112;
		int c = 5124;
		int d = 12;
		int min;

		min = (a > b ? b : a); // a�� b���� ũ�ٸ�? min�� b �ƴ϶�� a
		min = (min > c ? c : min); // min�� c���� ũ�ٸ�? min�� c �ƴ� ��� min
		min = (min > d ? d : min); // min�� d���� ũ�ٸ�? min�� d, �ƴ� ��� c

		System.out.println(min);

	}

}
