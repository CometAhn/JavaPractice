
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 1~100 Ȧ�� ����, 2. ������ ���� 1000�̸����� �����հ� i�� �� ���ϱ�.
		int i = 0;
		int i1 = 0;
		int sum = 0;
		int sum1 = 0;
		
		for(i=1;i<=100;i++) {
		
			if(i%2==0){
				sum+=i;
				
				if(sum<1000) {
					sum1+=i;
					i1 = i;
				}
			}
		}
		
		System.out.printf("1���� 100 ��, Ȧ�� ������ 1000�̸��� ���� �������� %d�̰� �� �� i�� %d�̴�.", sum1, i1);
	}

}
