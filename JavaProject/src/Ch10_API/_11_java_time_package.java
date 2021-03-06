package Ch10_API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class _11_java_time_package {

	public static void main(String[] args) {

		// LocalDate Start
		LocalDate Id = LocalDate.now();
		System.out.println(Id);

		LocalDate Id2 = Id.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(Id2);

		// 자동변환
		LocalDate Id3 = Id2.minusDays(3);
		System.out.println(Id3);

		// 주 더하기
		LocalDate Id4 = Id3.plusWeeks(3);
		System.out.println(Id4);
		// LocalDate End
		System.out.println();

		// LocalDateTime Start
		LocalDateTime Id5 = LocalDateTime.now();
		System.out.println("현재 시간 : " + Id5);
		LocalDateTime Id6 = Id5.minusHours(5).plusMinutes(30).minusSeconds(4);

		System.out.println("변경 시간 : " + Id6);

		LocalDateTime Id7 = Id6.minusHours(24);
		System.out.println("자동 변환 시간 : " + Id7);
		// LocalDateTime End
		System.out.println();

		// LocalDate With Start
		LocalDate Id8 = LocalDate.now();
		System.out.println(Id8);

		LocalDate New_Id = Id8.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(New_Id);
		// LocalDate With End
		System.out.println();

		// LocalTime With Start
		LocalTime It = LocalTime.now();
		System.out.println(It);

		LocalTime New_Time = It.withHour(3).withMinute(25).withSecond(24).withNano(33333);
		System.out.println(New_Time);
		// LocalTime With End
		System.out.println();

		// LeapYear Start Start
		LocalDate Id9 = LocalDate.now();
		LocalDate new_Id;
		int count = 0;

		for (int i = 1900; i <= 2100; i++) {
			new_Id = Id9.withYear(i);
			if (new_Id.isLeapYear()) {
				System.out.println(new_Id.getYear() + "은 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900년부터 2100년까지 윤년은 총" + count + "번 있습니다.");
		// LeapYear Start End
		System.out.println();

		// TemporlAdjuster Start
		LocalDate ldt = LocalDate.now();
		System.out.println(ldt);
		LocalDate new_ldt;

		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해 첫 번째 날 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해 마지막 날 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫번째 날 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 날 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번 달의 마지막 일요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + new_ldt);

		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt);
		// TemporlAdjuster End
		System.out.println();

		// Class info 비교1 Start
		LocalDateTime ldt1 = LocalDateTime.of(2010, 1, 1, 12, 23, 23, 444);
		System.out.println(ldt1);

		LocalDateTime ldt2 = LocalDateTime.of(2010, 12, 25, 1, 12, 2, 232);
		System.out.println(ldt2);

		System.out.print("ldt1이 ldt2보다 이후의 날짜인가? ");
		System.out.println(ldt1.isAfter(ldt2));
		System.out.print("ldt1이 ldt2보다 이전의 날짜인가? ");
		System.out.println(ldt1.isBefore(ldt2));
		System.out.print("ldt1과 ldt2은 같은 날짜인가? ");
		System.out.println(ldt1.isEqual(ldt2));
		// Class info 비교1 End
		System.out.println();

		// Class info 비교2 Start
		LocalDateTime ldt3 = LocalDateTime.now();
		System.out.println(ldt3);

		LocalDateTime end_time = LocalDateTime.of(2017, 6, 24, 12, 00);

		if (ldt3.isAfter(end_time)) {
			System.out.println("유통기한이 지났습니다.");
		} else {
			System.out.println("유통기한이 아직 지나지 않았습니다.");
		}
		// Class info 비교2 End
	}

}
