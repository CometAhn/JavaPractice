package _review;

public class _20220714_Array {

	public static void main(String[] args) {

		int[] num;
		num = new int[3];

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			System.out.println("배열 값 : " + num[i]);
		}
		/**
		 * 방법 1 for (int i = 0; i < num.length; i++)
		 */
		for (int i : num) {
			System.out.println("배열 값 : " + i);
		}
		/**
		 * 방법 2 for (int i : num)
		 */
	}

}
