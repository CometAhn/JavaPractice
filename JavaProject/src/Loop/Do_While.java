package Loop;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 적어도 한 줄은 출려되는 문장
		/*	
		int i = 10;
		
		do {
			
			System.out.println("적어도 한 번은 출력되는 문장");
		//	i++;
		
		} while(i>100);
		//} while(i<15);
		*/
		
		//do~while문을 이용하여 구구단 만들기
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
