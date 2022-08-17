package _review;

public class teststset {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int c = 0;

		int i = 0;
		while (i < 10) {

			c = +a + b;

			System.out.println(a + "+" + b + "=" + c);
			a = b;
			b = c;
			i++;

		}

	}

}
