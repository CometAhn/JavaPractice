
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ���� ����� �����ÿ�

		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' �� �����ڵ�� 65
		System.out.println(1 + x << 33); // 6
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // 66
		System.out.println(++c); // B
		System.out.println(c++);// B
		System.out.println(c); // C

		//[3-2]�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ��̴�.
		// ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ��� ���̴�.
		//(1)�� �˸��� �ڵ带 �����ÿ�.
		
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ( /* (1) */ ); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println(" :"+numOfBucket);
	}

}
