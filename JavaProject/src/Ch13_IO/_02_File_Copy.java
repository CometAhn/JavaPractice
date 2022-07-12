package Ch13_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_File_Copy {

	public static void main(String[] args) throws IOException {
		// 파일 복사 프로그램
		FileInputStream fis = null;
		FileOutputStream fos = null;
		fis = new FileInputStream("d:\\prac.txt");
		fos = new FileOutputStream("d:\\result.txt");

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int data;
		while ((data = fis.read()) != -1) { // 읽어들일 데이터가 있다면
			bos.write(data); // 출력 파일에 데이터를 넣어라.
		}
		bos.close(); // 사용한 스트림은 닫아주기
		bis.close();
	}

}
