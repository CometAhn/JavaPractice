
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
									// ���� Ÿ�� ������ ����.

		System.out.println(charval); // 65, A

		intval = 263;
		byteval = (byte) intval; // byte���� ���� Ÿ�� ��ȯ 128~127
		System.out.println(byteval); // 263 - 256 = 7

		// �Ǽ� Ÿ��(float, double)�� ���� Ÿ������
		// �ڵ� Ÿ�� ��ȯ ���� �ʱ� ������ ���� Ÿ�� ��ȯ�� ���.
		// �Ҽ��� ���� �κ��� ��������(�� �ս�), ���� �κи� ���� �ȴ�.

		doubleval = 3.14;
		intval = (int) doubleval;

		System.out.println(intval); // ���� ����ȯ�� �� ��, �� �ս��� �Ͼ �� �ִ�.
	}

}
