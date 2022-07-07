package Ch02_Number;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 127;
		int b = a; // 자동변환
		System.out.println(b);

		float c = b; // 자동변환
		System.out.println(c);

		int d = 263;
		System.out.println(d);
		byte e = (byte) d; // 명시적 형변환
		System.out.println(e);
	}

}