import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_foramt {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.printf("%1$tY�� %1$tB %1$td�� %tA\n", date);
		System.out.printf("%1$tH�� %1$tM�� %1$tS��\n", date);

		// ��¥�� ������ ���� ���� ����
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		String sfdate = fdate.format(date);
		System.out.print(sfdate);

	}

}
