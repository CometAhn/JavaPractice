package Pointer;

public class 이중배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub UP
		// 이중 배열
		/*
		 * int[][] num = {{1, 2}, {3, 4}, {5, 6}};
		 * 
		 * for (int i = 0; i < num.length; i++) { // 행의 길이
		 * 
		 * for (int j = 0; j < num[i].length; j++) { // 컬럼의 길이
		 * 
		 * System.out.printf("[%d][%d] = %d\n", i, j, num[i][j]); // i++;
		 * 
		 * }
		 * 
		 * }
		 */
		String[][] name = { { "홍길동", "이순신" }, { "유관순" } };
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.printf("[%d][%d] = %s\n", i, j, name[i][j]);
			}
		}
	}

}
