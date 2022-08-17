package _review;

public class test {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 2; i < a.length; i++) {
			a[i] = i;
			System.out.println("=== " + a[i] + "단 ===");
			for (int j = 2; j < b.length; j++) {
				b[j] = j;
				System.out.printf("%d * %d = %d\n", a[i], b[j], a[i] * b[j]);
				if (b[j] == 9) {
					if (!(a[i] == 9)) {
						System.out.println();
					}
				}

			}
		}
	}
}
