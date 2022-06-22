package Pointer;

public class Array_5_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub UP
		// string
		String[] numbers = { "one", "two", "three" };

		for (int i = 0; i < numbers.length; i++) { // ±âÁ¸
			// System.out.println(numbers[i]);
		}

		for (String i : numbers) { // foreach
			// System.out.println(i);
		}

		// int
		int[] number = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		for (int j : number) {
			// System.out.println(j);
		}

		// È¦¼ö¸¸
		int[] numberodd = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		for (int j : numberodd) {
			if (j % 2 == 1) {
				// System.out.println(j);
			}
		}

		// Â¦¼ö¸¸
		int[] numbereven = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		for (int j : numbereven) {
			if (j % 2 == 0) {
				if (j != 0) {// 0ÀÌ ¾Æ´Ò ¶§
					System.out.println(j);
				}
			}
		}
	}

}