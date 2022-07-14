/**
 * 커스텀 예외 처리
 * 기존 오류 메시지를 커스텀하여 출력
 * 
 */

package _review;

public class _20220714_Throw_cusmtom3 {
	public static void a() throws UserException {
		try {
			int num = 3 / 0;
		} catch (ArithmeticException e) {
			throw new UserException("0으로 나누어 에러 발생");
		}
	}

	public static void main(String[] args) {
		try {
			a();
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
