package Exception09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _2_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		try {
			int a = 0;
			int b = 2;
			int c = b / a;
		} catch (ArithmeticException e) {
			System.out.println("산술 오류");
		}
		try {
			char d = in.next().charAt(5);
		} catch (InputMismatchException e) {
			System.out.println("입력 오류");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("길이 짧음");
		}

	}
}