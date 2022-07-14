/**
 * userException을 만들어서 메세지 보냄
 */

package _review;

class UserException extends Exception {
	public UserException(String msg) {
		super(msg);
	}
}

public class _20220714_Throw_cusmtom2 {
	public static void a(int num) throws UserException {
		if (num < 100) {
			throw new UserException("num 길이가 100보다 작다.");
		}
	}

	public static void main(String[] args) {
		try {
			a(70);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}
