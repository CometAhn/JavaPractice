package �ݺ���;
import java.util.*;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// break�� Ȱ��,(���ǹ� Ż��)
/*		int i=1;
		while(i<=10) {
			
			if(i == 8) {
				
				break;
				
			}
			System.out.printf("%2d,",i++);
			
		}
*/		
		// �ߴ��ϰ��� �ϴ� ���� �Է� : n���� ����� �ߴܵǾ����ϴ�.
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("�ߴ� �ϰ��� �ϴ� ���� �Է� : ");
		
		int i = input.nextInt();
		
		while(true) {
			
			System.out.println(num);
			num++;
			
			if(num==i)

				//System.out.printf("%d���� �ߴܵǾ����ϴ�.",num);
				break;
		}
		System.out.printf("%d���� �ߴܵǾ����ϴ�.",num);
	}

}
