/**
 * 커스텀 예외 처리
 * 오류 메세지를 만들어서 출력
 * 
 */

package _review;

public class _20220714_Throw_cusmtom1 {
	public static void a(int num) throws Exception {
		if (num < 100) {
			throw new Exception("num 길이가 100보다 작다.");
		}
	}

	public static void main(String[] args) {
		System.out.println("시작");

		try {
			a(70);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}
