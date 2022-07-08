package Ch10_API;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _9_Formatting {

	public static void main(String[] args) {

		// DecimalFormat Start
		// 숫자 형식을 패턴으로 지정하여 패턴 모양에 따라 숫자가 출력되게 만든다.
		// DecimalFormat d = new DecimalForamt("패턴형식");
		// 출력 : System.out.println(d.format(패턴으로 만들 숫자));
		// # : 있으면 출력 , : 콤마를 넣음.
		// 0 : 없어도 0으로 채움 E : 지수 기호.
		// . : 소수저 % : 퍼센트 1
		// - : 음수 기호를 붙임
		String[] pattern = { "###.###", "000.000", "-###.###", "000000.00%", "###,###.###", "###,###.###" };

		double[] arr = { 1.3, 3.33, 124.243, 242, 1234.12, 123123123.123 };

		for (int p = 0; p < pattern.length; p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("<<<<<" + pattern[p] + ">>>>>");

			for (int i = 0; i < arr.length; i++) {
				System.out.println(d.format(arr[i]));
			}
		}
		// DecimalFormat End
		System.out.println();

		// SimpleDateFormat Start
		// 날짜를 형식화 하는 클래스
		Date day = new Date();
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String pattern1 = "y년M월d일 EEEE a h:m:s";

		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);

		System.out.println("현재 날짜 : " + day);
		System.out.println("한국 형식(년-월-일) : " + p1.format(day));
		System.out.println("미국 형식(월-일-년) : " + p2.format(day));
		System.out.println("영국 형식(일-월-년) : " + p3.format(day));
		System.out.println(p4.format(day));
		// SimpleDateFormat End

	}

}
