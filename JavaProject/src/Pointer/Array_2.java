package Pointer;
import java.util.*;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	//�������� ��� ���ϱ�
		int[] student = {100, 95, 90, 88, 93};
		int sum = 0;
		for(int i=0;i<student.length;i++) {
			sum += student[i];
		}
		
		System.out.println("���������� ��� : " + sum/(float)student.length);
	*/	
		
		// �迭 �̿�. �迭 ���̰� 5(int scores)
		// ����ڰ� 5�� �Է��� ������ �հ� ����� ���ϱ�
/*		Scanner in = new Scanner(System.in);

		
		int[] scores = new int[5];
		int sum = 0;
		int i;
		
		for(i=0;i<scores.length;i++) {

			System.out.printf("�Է��� ��");
			scores[i] = in.nextInt();
			sum+= scores[i];
		}

		System.out.printf("\n�հ� : %d\n",sum);
	
		System.out.printf("��� : %s",sum/(float)scores.length);
*/
		
		// 1. �л����� �Է��ؼ� �л� �� ��ŭ ������ �Է��Ͽ� �л����� ���հ� �л����� ��հ��� ����Ͻÿ�.
		// 2. ���� �Է½� 0�̸��̰ų� 100�ʰ��� ��� �����͸� �ٽ� �Է� ���� �� �ְ� ó���Ͻÿ�.
		// �л��� �迭
		// ���� �迭
		Scanner input = new Scanner(System.in); // ��ĳ�� ����
		
		int stunum = 0; // �л��� �迭 �� ������
		
		System.out.println("�л����� �� ���Դϱ�?");
		stunum = input.nextInt();	
		
		int[] scores = new int[stunum]; // ������ ��
		int sum = 0; // �հ�
		int i; 
		int min=0; // �ּҰ�
		int max=100; // �ִ밪
		
		for(i=0;i<stunum;i++) {
			System.out.println("������ �����Դϱ�??");	
			scores[i] = input.nextInt(); // �� �л��� ����.
			
			if((min>scores[i])||(max<scores[i])) {
				System.out.printf("�����Ͱ� �ʹ� ũ�ų� �۽��ϴ�. �ٽ� �Է��ϼ���\n");
				i--; // ī��Ʈ �ٽ� 1 ����.
				continue;
				}
			else {
				sum += scores[i]; // sum = ���� ����.
				
			}
		}
		System.out.printf("���� ���� :  %d\n",sum);
		System.out.printf("���� ��� :  %.1f",(float)sum/stunum);
			
	}

}
