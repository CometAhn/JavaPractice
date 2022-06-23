
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
		/*
		 * int a = 100; int b = 112; int c = 5124; int d = 12; int min;
		 * 
		 * min = (a > b ? b : a); // a가 b보다 크다면? min은 b 아니라면 a min = (min > c ? c :
		 * min); // min이 c보다 크다면? min은 c 아닐 경우 min min = (min > d ? d : min); // min이
		 * d보다 크다면? min은 d, 아닐 경우 c
		 * 
		 * System.out.println(min);
		 */

		// 2 8 16
		// 63: 1/1111 0077 0x3f
		// 126:111/1110 0176 0x7e
		// 72: 100/1000 0110 0x48
		// 99: 110/0011 0143 0x63

		// 128643216/8421 64 8 1
		// 0x3F 0011/1111 = 63 77
		// 0xDA 1101/1010 = 218 332
		// 0x9E 1001/1110 = 158 236
		// 0x25 0010/0101 = 37 45

		int a = 15; // 1111
		int b = 5; // 0101

		System.out.println(a | b); // 1111 15
		System.out.println(a & b); // 0101 5
		System.out.println(a ^ b); // 1010 10
		System.out.println(a >> 2); // 1111 0011 3
		System.out.println(b << 4); // 01010000 80

	}

}
