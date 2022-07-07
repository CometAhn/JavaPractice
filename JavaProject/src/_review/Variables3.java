package _review;
public class Variables3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteval = 10;
		int intval = byteval;

		intval = 20;
		double doubleval = intval;
		System.out.println(intval);
		System.out.println(doubleval);

		char charval = 'A';
		intval = charval;
		byteval = 65;
		charval = (char) byteval; // 음수가 지정될 수 있는 byte, int등의 타입은
									// char타입으로 자동타입변환 할 수 없다.
									// 강제 타입 변한은 가능.

		System.out.println(charval); // 65, A

		intval = 263;
		byteval = (byte) intval; // byte으로 강제 타입 변환 128~127
		System.out.println(byteval); // 263 - 256 = 7

		// 실수 타입(float, double)은 정수 타입으로
		// 자동 타입 변환 디지 않기 때문에 강제 타입 변환을 사용.
		// 소수점 이하 부분은 버려지고(값 손실), 정수 부분만 지정 된다.

		doubleval = 3.14;
		intval = (int) doubleval;

		System.out.println(intval); // 강제 형변환을 할 때, 값 손실이 일어날 수 있다.
	}

}