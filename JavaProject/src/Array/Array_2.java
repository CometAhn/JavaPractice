package Array;
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
		Scanner in = new Scanner(System.in);

		
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

			
	}

}
