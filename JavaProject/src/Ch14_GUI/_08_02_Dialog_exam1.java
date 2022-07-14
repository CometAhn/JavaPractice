
/**
 * 
 * @author comet@ipi.pw
 * 세 개의 정수(최대값 최소값 합계 평균)를 입력 받아서
 * 최대값 :
 * 최소값 :
 * 합계 :
 * 평균 :
 * 
 * 구하기
 */
package Ch14_GUI;

import javax.swing.JOptionPane;

public class _08_02_Dialog_exam1 {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		int max;
		int mid;
		int min;
		String val;
		int sum;
		double avg;
		int tmp;

		val = JOptionPane.showInputDialog("숫자를 입력하세요 : ");
		max = Integer.parseInt(val);
		val = JOptionPane.showInputDialog("숫자를 입력하세요 : ");
		mid = Integer.parseInt(val);
		val = JOptionPane.showInputDialog("숫자를 입력하세요 : ");
		min = Integer.parseInt(val);

		while (!(max >= mid && mid >= min && max >= min)) {
			if (mid >= max) {
				tmp = max;
				max = mid;
				mid = tmp;
			}
			if (min >= mid) {
				tmp = mid;
				mid = min;
				min = tmp;
			}

		}

		sum = max + mid + min;
		avg = (double) sum / 3;

		JOptionPane.showMessageDialog(null, "최대값 : " + max + "\n최소값 : " + min + "\n합계 : " + sum + "\n 평균 : " + avg);
	}

}
