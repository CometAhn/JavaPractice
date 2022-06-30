package second_test;
class exam4 {
	public static void main(String[] args) {

		// 문항4. 다음 프로그램을 완성 하시오. 아래의 프로그램은 문자열을 입력받아 문자열중 숫자가 포함되어있는지 한글자씩 판별하는 프로그램이다.
		// 문자가 숫자인지 아닌지를 판단하는 로직(프로그램)을 완성 하시오. (10점)
		// 참고 : 아스키코드 숫자 0 : 48 이며 숫자 9 : 57이다.

		String value = "12o34";
		char ch;
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {

			ch = value.charAt(i);

			if (ch >= '0' && ch <= '9') {
				isNumber = true;
			} else {
				isNumber = false;
			}

			if (isNumber) {
				System.out.println(value + "는 숫자입니다.");
			} else {
				System.out.println(value + "는 숫자가 아닙니다.");
			}

		}

	}
}
