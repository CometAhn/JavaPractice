package �ݺ���;
import java.util.*;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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
/*	
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
			//System.out.println("Ȧ���� �Էµ��� �ʾҽ��ϴ�.");
			System.out.println("������� ���� = " + sum);
		}
		else {

			System.out.println("�Էµ� Ȧ���� ���� = " + oddcount);
			System.out.println("�Էµ� Ȧ���� �հ� = " + oddsum);
			System.out.println("�Էµ� ���� ��� = " + oddsum/oddcount);
		}
*/	
		// ���� ���߱� ����.
		// ������ ����(random) ����. ���� : 72;  ��?��
		//  �� Math.random() : 0~1 �������� �Ҽ����� ������ ����.
		// ���ڸ� �Է��ϼ��� : Scanner input
		// input�� random���� �۴�, ũ��, ����
		//  �� ���� ���, n������ ������ϴ�.
		//  �� �ٽ� ���� �Ͻðڽ��ϱ�?((Y/N))
		//		�� Y�� continue, N�� break;
		// �ּҰ�, �ִ밪���� ũ�ų� ���� �� continue �� �׳� �߰�.

		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner uumin = new Scanner(System.in);
		Scanner uumax = new Scanner(System.in);
		
		int num = 0; // user�� �Է��� ����.
		int cnt = 0; // ī��Ʈ
		char yn; // ���� ������ ����
		
		// ����ڰ� ���� �����ϱ�
		int umin = 0;
		int umax = 0;

		System.out.printf("���ӿ��� ����� �ּ� ������ �������ּ���\n");
		umin = input.nextInt();
		
		System.out.printf("���ӿ��� ����� �ִ� ������ �������ּ���\n");
		umax = input.nextInt();

		

		int min = umin; // ������ �ּҰ�
		int max = umax; // ������ �ִ밪
		
		// �ּ�, �ִ밪�� �̿��� ��������.
		int random = (int)(Math.random()*100000); // �����ϰ� ������ ����. (0~����)
		System.out.printf("���� ���� ������\n"); //���� �׽�Ʈ��
		//System.out.println(random);  // random �׽�Ʈ
		
		
		while(true) {
			if((umin>random)||(umax<random)) { // ����ڰ� ������ ���� �����.
				random = (int)(Math.random()*1000000000); // �ٽ� �� ���ϱ�
				continue; // ���ǹ� Ż��
			}else { // �� ���̸�
				break;
			}
		}
		
		//System.out.printf("������ �����մϴ�.\n");
		//System.out.println(random);  // random �׽�Ʈ
		//System.out.printf("���� �׽�Ʈ%d %d \n", umin, umax); //���� �׽�Ʈ��
		
			while(true){

				System.out.printf("���ڸ� �Է��ϼ���.\n(%d~%d)\n",min,max);
			
				num = input.nextInt();
		/*
				if(min>num) { // �ּҰ����� �Է��� ���� ���� ��
					System.out.printf("�Է��� ���ڰ� �ּҰ����� �۽��ϴ�. �ٽ� �Է����ּ���.\n\n");
					continue;
				}
				if(max<num) { // �ִ밪���� �Է��� ���� Ŭ ��
					System.out.printf("�Է��� ���ڰ� �ִ밪���� Ů�ϴ�. �ٽ� �Է����ּ���.\n\n");
					continue;
				}*/
			
				if(random != num) { // ���ڰ� �ٸ� ��.
					if(random > num) { // ������ �� Ŭ ��
						System.out.printf("�Է��� ���ڰ� �� �۽��ϴ�.\n");
						min = num;
						min = min+1;
						cnt++;
						continue;
					
					}
					else if(random < num) { // ������ �� ���� ��
						System.out.printf("�Է��� ���ڰ� �� Ů�ϴ�.\n");
						max = num;
						max = max-1;
						cnt++;
						continue;
					
					}

				}
				else {
					System.out.printf("�����Դϴ�! %dȸ�� ������ϴ�.\n", cnt);
					System.out.printf("������ �ٽ� �����Ͻðڽ��ϱ�?(Y/N)\n");

					yn = in.next().charAt(0); // char n���� ���� : .next().charAt(n);
			
					if ((yn=='Y')||(yn=='y')){
				
						random = (int)(Math.random()*90+10); // �ٽ� �����ϰ�.
						cnt = 0; // ī��Ʈ �ʱ�ȭ
						min = 10; // �ּҰ� �ʱ�ȭ
						max = 99; // �ִ밪 �ʱ�ȭ
						System.out.printf("������ �ٽ� �����մϴ�...\n\n\n");
						System.out.printf("������ �����մϴ�.\n");
				
						continue;	
			
					}
					else if((yn=='N')||(yn=='n')){
						//random = (int)(Math.random()*90+10); // �ٽ� �����ϰ�. ����?
						//cnt = 0; // ī��Ʈ �ʱ�ȭ
						System.out.printf("������ ����˴ϴ�...\n");
						break;
					}
				}
			}// while ����
	}
}
