package Loop;
import java.util.Scanner;

public class switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score;
		char grade;

		System.out.print("����� ������ �Է��ϼ��� :");
		Scanner input = new Scanner(System.in);
		score = input.nextInt() / 10;

		switch (score) {

			case 10 :
				grade = 'A';
				break;
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';

		}

		if (score == 10) {
			System.out.println("�����Դϴ�.");
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		} else {

			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
		// System.out.println("����� ������ " + grade + " �Դϴ�.");
	}

}
