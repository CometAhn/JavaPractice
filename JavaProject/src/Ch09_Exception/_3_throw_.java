package Ch09_Exception;

public class _3_throw_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception a = new Exception("고의 예외");
			throw a;
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}

	}

}
