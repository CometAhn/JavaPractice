package Ch10_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

	}

}