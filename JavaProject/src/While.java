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
		//Y,y �� ��, �ݺ�.
/*		Scanner in = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while((answer.equals("Y"))||(answer.equals("y"))) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
			answer = in.nextLine();
			
			if((answer.equals("Y"))||(answer.equals("y"))) {
				System.out.printf("������ %d�� ����߽��ϴ�.", ++count);
				
			}
		}
		System.out.println("�������");
*/
		// ���ϴ� ���ڱ��� 1++
/*		
		Scanner input = new Scanner(System.in);
		int i = 1;
		System.out.printf("���ڸ� �Է��ϼ���.");
		int want = input.nextInt();
		
		while(i<=want) {
			System.out.printf("%5d",i++);
		}
*/			
		
		//������ i��(a * b)=output
		int a = 2;
		while(a < 10) {
			int b = 1;
			
			while(b < 10) {
				System.out.printf("%3d*%d = %2d,",a, b,a*b);
				b++;
			}
			System.out.printf("\n");
			a++;
		}
			
		
		
	}

}
