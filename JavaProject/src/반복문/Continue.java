package �ݺ���;
import java.util.*;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue�� �̿��Ͽ� 1~100���� Ȧ���� ��.		
/*		int i = 1;
		int sum= 0;
		
		for(i=1;i<=100;i++) {
			
			if(i%2==0) {
				continue; // ó������ ���ư�.
			}else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
*/		
		// 1~10���� ���� �߿��� Ȧ�� ���� ��� �Ͻÿ�(continue ���.)
/*		int i = 0;
		for(i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.printf("%2d,",i);
			
		}*/
/*
		int money = 10000;
		System.out.println("���簡������ "+money+"�Դϴ�."); // ���� �������� 10000
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�󸶸� ����Ͻðڽ��ϱ�?");
			int i = sc.nextInt();
			
			if(!(0<=i && i<= money)) { // (���� 0������ �۰� ���� ���� ũ��)���� ->  0>���� ~ ������<����, �� ���
				System.out.println("�ٽ� �Է����ּ���(�������� Ʋ�Ƚ��ϴ�.)");
				continue; // while�� ���ư�.
			}
			
			System.out.printf("���� %d���� ���ҽ��ϴ�. \n", money -= i); // money - i ����Ʈ
			if(money == 0) { // money�� 0�� �� ��� ���ǹ����� ������.
				break;
			}
		}
		System.out.println("��� ���� ����մϴ�. ����"); // ���ǹ����� ������ = money�� 0�� �� ���
*/

	}

}
