package _review;

public class _20220714_Exception {

	public static void main(String[] args) {

		System.out.println("시작");
		String name = null;
		/*
				try {
					int value = 0;
					int num = 3 / value;
					int mun2 = num + 100;
				} catch (Exception e) {
					e.printStackTrace();
					// e.getMessage();
		
				} finally {
					System.out.println("프로그램 정상 종료");
				}*/

		try {
			int num = 3 / 0;
			System.out.println("문자열의 길이 : " + name.length());

		} finally {
			System.out.println("모든 예외처리 가능");
		}
		System.out.println("프로그램 정상 종료");
	}

}
