package Pointer;

public class ���߹迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub UP
		// ���� �迭
		/*
		 * int[][] num = {{1, 2}, {3, 4}, {5, 6}};
		 * 
		 * for (int i = 0; i < num.length; i++) { // ���� ����
		 * 
		 * for (int j = 0; j < num[i].length; j++) { // �÷��� ����
		 * 
		 * System.out.printf("[%d][%d] = %d\n", i, j, num[i][j]); // i++;
		 * 
		 * }
		 * 
		 * }
		 */
		String[][] name = { { "ȫ�浿", "�̼���" }, { "������" } };
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.printf("[%d][%d] = %s\n", i, j, name[i][j]);
			}
		}
	}

}
