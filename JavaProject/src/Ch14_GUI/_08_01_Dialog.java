package Ch14_GUI;

import java.awt.*;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 * @author Comet
 * 
 *         1 ~ 10의 숫자를 생성해서 맞추는 프로그램 예제
 */

public class _08_01_Dialog {

	public static void main(String[] args) {

		String targetStr, result;
		int again = 0;
		int target, guess;

		// 1 ! 10까지의 숫자 랜덤
		Random generator = new Random();
		target = generator.nextInt(9) + 1;

		do {
			// 사용자가 추측하는 정수를 입력 받는다.
			targetStr = JOptionPane.showInputDialog("추측 숫자를 입력하세요 : ");

			guess = Integer.parseInt(targetStr);

			if (guess > target) {
				result = "당신의 추측 숫자는 큽니다.";
			} else if (guess < target) {
				result = "당신의 추측 숫자는 작습니다.";
			} else {

				result = "정답임";
			}
			// 결과 표시
			JOptionPane.showMessageDialog(null, result);

			// 다시 할지?
			again = JOptionPane.showConfirmDialog(null, "계속 하시겠습니까?");
		} while (again == JOptionPane.YES_OPTION);

	}

}
