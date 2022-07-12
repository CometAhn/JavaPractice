package Ch13_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01_Stream_Exception {

	public static void main(String[] args) {
		// 파일 복사 프로그램

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("D:\\parc.txt");
			fos = new FileOutputStream("d:\\result.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int data;

			while ((data = fis.read()) != -1) { // 읽어들일 데이터가 있다면
				bos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
