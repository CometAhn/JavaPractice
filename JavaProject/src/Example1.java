
public class Example1 {

	public static void main(String[] args) {

		int intval = 45208;
		char charval = (char) intval; // charval�� ���� char 44032�� ����
		System.out.println(charval);

		long longval = 500;
		intval = (int) longval; // intval�� ���� int 500���� ����
		System.out.println(intval);

		double doubleval = 3.14;
		intval = (int) doubleval; // intval�� ���� int 3���� ����
		System.out.println(intval);

		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���ϼ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}