package Ch13_IO;

import java.io.InputStreamReader;

public class _03_File_IO_Test_Char {

	public static void main(String[] args) {

		// InputStreamReader를 이용한 방법 Char(문자)입력
		InputStreamReader reader = null;
		try {
			byte[] b = new byte[5];s
			System.out.println("데이터를 입력하세요. :");
			reader = new InputStreamReader(System.in);
			int n = reader.read();
			System.out.println("입력 값 : " + ((char) n));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
