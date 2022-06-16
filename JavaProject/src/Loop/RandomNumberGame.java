package Loop;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���߱� ����.
		// ������ ����(random) ����. ���� : 72; ��?��
		// �� Math.random() : 0~1 �������� �Ҽ����� ������ ����.
		// ���ڸ� �Է��ϼ��� : Scanner input
		// input�� random���� �۴�, ũ��, ����
		// �� ���� ���, n������ ������ϴ�.
		// �� �ٽ� ���� �Ͻðڽ��ϱ�?((Y/N))
		// �� Y�� continue, N�� break;
		// �ּҰ�, �ִ밪���� ũ�ų� ���� �� continue �� �׳� �߰�.

		Scanner input = new Scanner(System.in);
		// Scanner in = new Scanner(System.in);
		// Scanner uumin = new Scanner(System.in);
		// Scanner uumax = new Scanner(System.in);

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

		int random = (int) (Math.random() * 100000); // �����ϰ� ������ ����. (0~����)
		System.out.printf("���� ���� ������\n"); // while�� ������ ���� �ð��ɸ�

		while (true) {
			if ((umin > random) || (umax < random)) { // ����ڰ� ������ ���� �����.
				random = (int) (Math.random() * 1000000000); // �ٽ� �� ���ϱ�
				continue; // ���ǹ� Ż��
			} else { // �� ���̸�
				break;
			}
		}

		// System.out.printf("������ �����մϴ�.\n");
		// System.out.println(random); // random �׽�Ʈ
		// System.out.printf("���� �׽�Ʈ%d %d \n", umin, umax); // ���� �׽�Ʈ��

		while (true) {

			System.out.printf("���ڸ� �Է��ϼ���.\n(%d~%d)\n", min, max);

			num = input.nextInt();
			/*
			 * if(min>num) { // �ּҰ����� �Է��� ���� ���� ��
			 * System.out.printf("�Է��� ���ڰ� �ּҰ����� �۽��ϴ�. �ٽ� �Է����ּ���.\n\n");
			 * continue; } if(max<num) { // �ִ밪���� �Է��� ���� Ŭ ��
			 * System.out.printf("�Է��� ���ڰ� �ִ밪���� Ů�ϴ�. �ٽ� �Է����ּ���.\n\n"); continue;
			 * }
			 */

			if (random != num) { // ���ڰ� �ٸ� ��.
				if (random > num) { // ������ �� Ŭ ��
					System.out.printf("�Է��� ���ڰ� �� �۽��ϴ�.\n");
					min = num;
					min = min + 1;
					cnt++;
					continue;

				} else if (random < num) { // ������ �� ���� ��
					System.out.printf("�Է��� ���ڰ� �� Ů�ϴ�.\n");
					max = num;
					max = max - 1;
					cnt++;
					continue;

				}

			} else {
				System.out.printf("�����Դϴ�! %dȸ�� ������ϴ�.\n", cnt);
				System.out.printf("������ �ٽ� �����Ͻðڽ��ϱ�?(Y/N)\n");

				yn = input.next().charAt(0); // char n���� ���� : .next().charAt(n);

				if ((yn == 'Y') || (yn == 'y')) {

					random = (int) (Math.random() * 90 + 10); // �ٽ� �����ϰ�.
					cnt = 0; // ī��Ʈ �ʱ�ȭ
					min = 10; // �ּҰ� �ʱ�ȭ
					max = 99; // �ִ밪 �ʱ�ȭ
					System.out.printf("������ �ٽ� �����մϴ�...\n\n\n");
					System.out.printf("������ �����մϴ�.\n");

					continue;

				} else if ((yn == 'N') || (yn == 'n')) {
					// random = (int)(Math.random()*90+10); // �ٽ� �����ϰ�. ����?
					// cnt = 0; // ī��Ʈ �ʱ�ȭ
					System.out.printf("������ ����˴ϴ�...\n");
					break;
				}
			}
		} // while ����
	}

}
