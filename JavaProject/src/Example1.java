
public class Example1 {

	public static void main(String[] args) {

		int intval = 45208;
		char charval = (char) intval; // charval의 값을 char 44032로 변경
		System.out.println(charval);

		long longval = 500;
		intval = (int) longval; // intval의 값을 int 500으로 변경
		System.out.println(intval);

		double doubleval = 3.14;
		intval = (int) doubleval; // intval의 값을 int 3으로 변경
		System.out.println(intval);

		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인하세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}