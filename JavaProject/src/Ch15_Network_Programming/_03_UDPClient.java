package Ch15_Network_Programming;

import java.io.*;
import java.net.*;

public class _03_UDPClient {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

		byte[] msg = new byte[100];

		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 8000);
		DatagramPacket inpacket = new DatagramPacket(msg, msg.length);

		datagramSocket.send(outPacket);
		datagramSocket.receive(inpacket);
		System.out.println("서버로 부터의 메시지 : " + new String(inpacket.getData()));
		datagramSocket.close();

	}

	public static void main(String[] args) {
		try {
			new _03_UDPClient().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
