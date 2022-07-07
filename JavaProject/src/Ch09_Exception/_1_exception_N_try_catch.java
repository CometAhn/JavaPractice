package Ch09_Exception;

public class _1_exception_N_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예시1
		System.out.println("예시1");
		try {
			int[] a = { 2, 8 };
			int b = 4;
			int c = b / a[2];
		} catch (ArithmeticException e) {
			System.out.println("산술 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류");

		}
		// 예시2
		System.out.println("\n예시2");
		int a2 = 0;
		int b2 = 2;

		try {
			System.out.println("외부로 접속");
			int c2 = b2 / a2;
		} catch (ArithmeticException d) {
			System.out.println("오류가 발생했습니다.");
		} finally { // 예외 여부 상관없이 실행되는 부분.
			System.out.println("무조건 연결 해제.");
		}
	}
}