package Loop;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��� �� ���� ����Ǵ� ����
		/*	
		int i = 10;
		
		do {
			
			System.out.println("��� �� ���� ��µǴ� ����");
		//	i++;
		
		} while(i>100);
		//} while(i<15);
		*/
		
		//do~while���� �̿��Ͽ� ������ �����
		int row = 1;
		int column = 2;
		
		do {
			row++;
			do {
			 System.out.printf("%3d*%d = %2d,",row, column,row*column);
				column++;
			 
			} while(column<10);
			
			column = 2;
			System.out.printf("\n");
			
		}while(row<10);
		
	}

}
