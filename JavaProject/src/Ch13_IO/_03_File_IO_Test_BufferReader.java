package Ch13_IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _03_File_IO_Test_BufferReader {

	public static void main(String[] args) {

		// InputStreamReader를 이용한 방법 Char(문자)입력
		BufferedReader buffer = null;
		try {
			byte[] b = new byte[5];
			System.out.println("데이터를 입력하세요. :");
			buffer = new BufferedReader(new InputStreamReader(System.in));
			String str = buffer.readLine();
			System.out.println("입력 값 : " + str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
