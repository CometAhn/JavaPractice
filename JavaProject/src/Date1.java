import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {

		// 뭐여 외 않되? import java.util.date;
		Date date = new Date();

		System.out.printf("%1$tY년 %1$tB %1$td일 %tA\n", date);
		System.out.printf("%1$tH시 %1$tM분 %1$tS초\n", date);

		// 날짜의 데이터 형식 포맷 변경
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String sfdate = fdate.format(date);
		System.out.print(sfdate);

	}

}
