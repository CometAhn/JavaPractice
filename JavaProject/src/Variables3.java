
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
		charval = (char) byteval; // ������ ������ �� �ִ� byte, int���� Ÿ����
									// charŸ������ �ڵ�Ÿ�Ժ�ȯ �� �� ����.

		System.out.println(charval); // 65, A
	}

}
