package Ch10_API;

import java.text.DecimalFormat;

public class _9_Formatting {

	public static void main(String[] args) {

		// DecimalFormat : 숫자 형식을 패턴으로 지정하여 패턴 모양에 따라 숫자가 출력되게 만든다.
		// DecimalFormat d = new DecimalForamt("패턴형식");
		// 출력 : System.out.println(d.format(패턴으로 만들 숫자));

		String[] pattern = { "###.###", "000.000", "-###.###", "000000.00%" };

		double[] arr = { 1.3, 3.33, 124.243, 242 };

		for (int p = 0; p < pattern.length; p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);

			System.out.println("<<<<<" + pattern[p] + ">>>>>");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(d.format(arr[i]));
			}
		}
	}

}
