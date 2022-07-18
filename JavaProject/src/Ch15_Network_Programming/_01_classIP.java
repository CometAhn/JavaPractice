package Ch15_Network_Programming;

import java.net.*;

public class _01_classIP {

	public static void main(String[] args) {

		InetAddress ip = null;

		try {
			ip = InetAddress.getLocalHost();

			System.out.println(ip.getHostName());

			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
