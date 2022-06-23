
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

		min = (a > b ? b : a); // a가 b보다 크다면? min은 b 아니라면 a
		min = (min > c ? c : min); // min이 c보다 크다면? min은 c 아닐 경우 min
		min = (min > d ? d : min); // min이 d보다 크다면? min은 d, 아닐 경우 c

		System.out.println(min);

	}

}
