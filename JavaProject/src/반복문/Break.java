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
/*		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("�ߴ� �ϰ��� �ϴ� ���� �Է� : ");
		
		int i = input.nextInt();
		
		while(true) {
			
			System.out.println(num);
			num++;
			
			if(num==i)

				break;
		}
		System.out.printf("%d���� �ߴܵǾ����ϴ�.",num);
*/
/*	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ��� : (�����Ϸ��� 0�Է�)");
			
			i = sc.nextInt();
			if(i==0) {
				break;
			}
			
			sum+= i;
			
		}
		System.out.println("������� ���� = " + sum);
*/

	
		// ������ ��� �Է� �޴ٰ� 0�� �ԷµǸ� �Էµ� ���� ����, �հ�, ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(p.67 ����)
/*		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		int count = 0;
		
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ��� : (�����Ϸ��� 0�Է�)");
			
			i = sc.nextInt();
			if(i==0) {
				break;
			}
			
			sum+= i;
			count++;
			
		}
		//System.out.println("������� ���� = " + sum);
		System.out.println("�Էµ� ���� ���� = " + count);
		System.out.println("�Էµ� ���� �հ� = " + sum);
		System.out.println("�Էµ� ���� ��� = " + sum/count);
*/
		// �� ������ �����Ͽ� ������ ��� �Է� �޴ٰ� 0�� �ԷµǸ� �Էµ� ���� �߿��� Ȧ���� �հ�, Ȧ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// �Է� ������ 5, 8, 17, 6, 31, 0
		// ��� 
		// Ȧ���� �� = 53
		// Ȧ���� ��� = 17
	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		int count = 0;
		int odd = 0;
		int oddsum = 0;
		int oddcount = 0;
		
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ��� : (�����Ϸ��� 0�Է�)");


			i = sc.nextInt();
			
			if(i==0) {
				break;
			}
			
			if(i%2==1) {
				odd++;	
				oddsum+= i;
				oddcount++;
			}
			
			sum+= i;
			count++;
			
		}
		if(odd==0)
		{
			System.out.println("Ȧ���� �Էµ��� �ʾҽ��ϴ�.");
		}
		else {

			System.out.println("�Էµ� Ȧ���� ���� = " + oddcount);
			System.out.println("�Էµ� Ȧ���� �հ� = " + oddsum);
			System.out.println("�Էµ� ���� ��� = " + oddsum/oddcount);
		}
	
	}
}
