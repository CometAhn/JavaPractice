import java.util.*;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~100 ����
/*
 		int i = 1;
 
		int sum = 0;
		
		while(i<=100) {
			sum+=i;
			i++;
			
		}
		
		System.out.printf("1���� 100������ ���� %d�̴�.", sum );
*/
		Scanner in = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while(answer.equals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
			answer = in.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("������ %d�� ����߽��ϴ�.", ++count);
				
			}
		}
		System.out.println("�������");
		
	}

}
