package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("프로그램을 시작합니다");
			System.out.println("입력:1 출력:2");
			int choic = sc.nextInt();
			if (choic == 1) {
				input ip = new input();
				ip.person_add();
			} else {
				printer pt = new printer();
				pt.pt();
			}
		}
	}

}
