package Ch15_Network_Programming;

import java.net.*;
import java.io.*;

public class _03_UDPServer {
	public void start() throws IOException {
		DatagramSocket socket = new DatagramSocket(8000);
		DatagramPacket inPacket, outPacker;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while (true) {
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			System.out.println("접속 요청이 들어온 포트 번호 : " + port);
			String msg = "this is UDP";
			outMsg = msg.getBytes();
			// 소포를 보내는 것임.
			outPacker = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacker);

		}
	}

	public static void main(String[] args) {
		try {
			new _03_UDPServer().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
