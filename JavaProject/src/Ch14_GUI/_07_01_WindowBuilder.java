package Ch14_GUI;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class _07_01_WindowBuilder extends JFrame {
	private JTextField tfb;
	private JTextField tfa;

	public _07_01_WindowBuilder() {
		setTitle("두 숫자의 값 구하기");
		setSize(new Dimension(350, 450));
		setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().setLayout(null);

		JLabel lbla = new JLabel("a의 값");
		lbla.setBounds(0, 1, 167, 82);
		lbla.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(lbla);

		tfa = new JTextField();
		tfa.setBounds(167, 1, 167, 82);
		tfa.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(tfa);
		tfa.setColumns(10);

		JLabel lblb = new JLabel("b의 값");
		lblb.setBounds(0, 83, 167, 82);
		lblb.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(lblb);

		tfb = new JTextField();
		tfb.setBounds(167, 83, 167, 82);
		tfb.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(tfb);
		tfb.setColumns(10);

		JButton bntSum = new JButton("합 구하기");
		bntSum.setBounds(0, 165, 167, 82);

		bntSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bntSum.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(bntSum);

		JButton bntMinus = new JButton("차 구하기");
		bntMinus.setBounds(167, 165, 167, 82);

		bntMinus.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(bntMinus);

		JButton btnNewButton = new JButton("곱 구하기");
		btnNewButton.setBounds(0, 247, 167, 82);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("나눗셈 구하기");
		btnNewButton_1.setBounds(167, 247, 167, 82);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		getContentPane().add(btnNewButton_1);

		JLabel lblResult = new JLabel("결과 값");
		lblResult.setBounds(0, 329, 167, 82);
		lblResult.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(lblResult);

		JLabel lblOutput = new JLabel("결과");
		lblOutput.setBounds(167, 329, 167, 82);
		lblOutput.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().add(lblOutput);
		bntSum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfa.getText()) + Integer.parseInt(tfb.getText());
				String b = Integer.toString(a);
				lblOutput.setText(b);

			}
		});
		bntMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfa.getText()) - Integer.parseInt(tfb.getText());
				String b = Integer.toString(a);
				lblOutput.setText(b);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfa.getText()) * Integer.parseInt(tfb.getText());
				String b = Integer.toString(a);
				lblOutput.setText(b);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int a = Integer.parseInt(tfa.getText()) / Integer.parseInt(tfb.getText());
				String b = Integer.toString(a);
				lblOutput.setText(b);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		_07_01_WindowBuilder a = new _07_01_WindowBuilder();
	}

}
