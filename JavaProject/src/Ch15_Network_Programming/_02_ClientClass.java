package Ch15_Network_Programming;

import java.net.*;
import java.io.*;

public class _02_ClientClass {

	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			System.out.println("서버에 연결을 시도하는 중...");

			// 포트 번호 8000과 serverIP를 가지고 접속을 시도
			Socket socket = new Socket(serverIp, 8000);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("서버로 부터 받은 메시지 : " + dis.readUTF());
			dis.close();
			socket.close();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
