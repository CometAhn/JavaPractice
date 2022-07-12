package Ch13_IO;

import java.io.InputStream;

public class _03_File_IO_Test {

	public static void main(String[] args) {

		InputStream is = null;
		try {
			byte[] b = new byte[5];
			System.out.println("데이터를 입력하세요. :");
			is = System.in;
			int n = is.read(b);
			System.out.println("입력 개수 : " + n);
			for (byte bb : b) {
				System.out.println("입력 값 : " + ((char) bb));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
