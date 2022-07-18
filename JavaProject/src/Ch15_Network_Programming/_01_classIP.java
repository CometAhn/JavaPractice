package Ch15_Network_Programming;

import java.net.*;

public class _01_classIP {

	public static void main(String[] args) {

		InetAddress ip = null;

		try {
			ip = InetAddress.getByName("www.daum.net");

			System.out.println(ip.getHostName());

			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			ip = InetAddress.getByName("www.naver.com");

			System.out.println(ip.getHostName());

			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			ip = InetAddress.getByName("google.com");

			System.out.println(ip.getHostName());

			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			ip = InetAddress.getByName("https://eieifemiofmeowfmwe.com/"); // 오류

			System.out.println(ip.getHostName());

			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("오류");
		}
		/*
			try {
				ip = InetAddress.getLocalHost();
		
				System.out.println(ip.getHostName());
		
				System.out.println(ip.getHostAddress());
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		*/
	}

}
