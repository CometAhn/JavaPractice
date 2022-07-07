package Ch10_API;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _2_Date_N_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.currentTimeMills() Start
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);

		int cnt = 0;
		for (int i = 0; i < 100000000; i++) {
			cnt++;
		}
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : " + end);
		System.out.println("걸린 작업 시간 : " + (end - start));
		// System.currentTimeMills() End
		System.out.println();

		// java.util.Calendar Start
		// import java.util.Calendar;
		Calendar a = Calendar.getInstance();
		System.out.println(a.toString());
		// java.util.Calendar End
		System.out.println();

		// get Method Start
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH);
		int date = a.get(Calendar.DATE);

		System.out.println(year + "년 " + month + "월 " + date + "일");

		System.out.print("오늘은 몇 번째 요일인가? ");
		System.out.println(a.get(Calendar.DAY_OF_WEEK)); // 1일, 2월, 3화, 4수, 5목, 6금, 7토

		System.out.print("이번 년도에서 오늘이 몇 일째인가? ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));

		System.out.print("이번 달은 며칠까지 있는가? ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
		// get Method End
		System.out.println();

		// java.util.GregorianCalendar Start
		// import java.util.GregorianCalendar;
		Calendar b = new GregorianCalendar();
		System.out.println(b.toString());
		// java.util.GregorianCalendar End
		System.out.println();

		// D-day start
		Calendar today = Calendar.getInstance();
		Calendar endOFYear = Calendar.getInstance();
		Calendar Christmas = Calendar.getInstance();

		endOFYear.set(Calendar.MONTH, 11); // 12월 month(문자 jan, feb ,mar)만 0부터 시작, year(숫자), date(숫자)는 1부터 시작
		endOFYear.set(Calendar.DATE, 31); // 31일

		long diff = endOFYear.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("연말까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");

		Christmas.set(2022, 11, 25);
		diff = Christmas.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");
		// D-day End
		System.out.println();

		// birth Start
		Calendar birth = Calendar.getInstance();
		Calendar today1 = Calendar.getInstance();

		birth.set(1995, 4, 20);
		long diff1 = today1.getTimeInMillis() - birth.getTimeInMillis();

		System.out.println("내가 태어난지 " + diff1 / (24 * 60 * 60 * 1000) + "일 지남.");

		birth.set(2022, 4, 20);
		diff1 = today1.getTimeInMillis() - birth.getTimeInMillis();

		System.out.println("생일이 지난지 " + diff1 / (24 * 60 * 60 * 1000) + "일 지남.");
		// birth End
		System.out.println();

	}

}
