
public class Example1 {

	public static void main(String[] args) {

		int intval = 44032;
		char charval = (char) intval; // charval�� ���� char 44032�� ����
		System.out.println(charval);

		long longval = 500;
		intval = (int) longval; // intval�� ���� int 500���� ����
		System.out.println(intval);

		double doubleval = 3.14;
		intval = (int) doubleval; // intval�� ���� int 3���� ����
		System.out.println(intval);

	}

}
