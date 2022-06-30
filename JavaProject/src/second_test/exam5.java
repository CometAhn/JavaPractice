package second_test;
import java.util.Arrays;

public class exam5 {

	public static void main(String[] args) {

		// 문항5. 다음의 배열에 입력되어있는 값을 내림차순(높은값부터 낮은 값순)으로 정렬하는 프로그램을 제작하시오. (10점) 값을 저장하는
		// 변수는 배열을 사용하시오 [99,43,56,32,22,87,140,55]

		int[] asc = { 99, 43, 56, 32, 22, 87, 140, 55 };
		int[] desc = asc.clone();
		int tmp;

		for (int i = 0; i < asc.length - 1; i++) {
			for (int j = i + 1; j < asc.length; j++) {
				if (asc[i] > asc[j]) {
					tmp = asc[i];
					asc[i] = asc[j];
					asc[j] = tmp;
				}
			}
		}
		for (int i = 0; i < desc.length - 1; i++) {
			for (int j = i + 1; j < desc.length; j++) {
				if (desc[i] < desc[j]) {
					tmp = desc[i];
					desc[i] = desc[j];
					desc[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(asc));
		System.out.println(Arrays.toString(desc));
	}

}
