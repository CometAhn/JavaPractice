
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

		System.out.println(charval); // 65, A
	}

}
